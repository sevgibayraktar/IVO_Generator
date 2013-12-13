import java.io.*;
import java.util.Vector;

/**
 * Created by IntelliJ IDEA.
 * User: Sevgi Bayraktar
 * Date: 25.11.2011
 * Time: 10:02
 * To change this template use File | Settings | File Templates.
 */
public class GenerateIVO {
    public static void main(String args[]) {
        try {

            String path = "C:\\IVO_GENERATOR";
            String sourceFile = "\\SOURCE\\PerosnalHealth.txt";

            FileInputStream fstream = new FileInputStream(path+sourceFile);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String strLine;
            Vector fieldsVector = new Vector();
            String className = "";
            className = putFileIntoVector(br, fieldsVector, className);

            String targetFile = "\\TARGET\\" + className + ".java";
            FileWriter foutstream = new FileWriter(path+targetFile);
            BufferedWriter out = new BufferedWriter(foutstream);

            writeClassNameDefinition(className, out);
            writeFieldNameDeclarations(fieldsVector, out);
            writeStaticBlock(fieldsVector, className, out);
            writeConstructor(className, out);
            writeEntityNrFunction(out);
            writeGetterSetterMethods(fieldsVector, out);
            closeStreams(in, out);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void closeStreams(DataInputStream in, BufferedWriter out) throws IOException {
        out.write("} ");
        out.close();
        in.close();
    }

    private static String putFileIntoVector(BufferedReader br, Vector fieldsVector, String className) throws IOException {
        String strLine;
        for (int i = 0; (strLine = br.readLine()) != null; i++) {
            if (i > 0) {
                String[] fieldPropsStr = strLine.split(";");
                String name = fieldPropsStr[1];
                String type = fieldPropsStr[0];
                String s_c = fieldPropsStr[2];
                FieldProps fieldProps = new FieldProps();
                fieldProps.setName(name);
                fieldProps.setType(type);
                fieldProps.setSimpleOrComplex(s_c);
                fieldsVector.add(fieldProps);
                System.out.println(name);
            } else {
                className = strLine;
            }

        }
        return className;
    }

    private static void writeClassNameDefinition(String className, BufferedWriter out) throws IOException {
        out.write("@IDITVORegistration(isVOHasJDO = false)\n" +
                "public class " + className + " extends AbstractUtilsIVO {");
    }

    private static void writeFieldNameDeclarations(Vector fieldsVector, BufferedWriter out) throws IOException {
        out.write("\n");
        for (int i = 0; i < fieldsVector.size(); i++) {
            try {
                FieldProps fieldProps = (FieldProps) fieldsVector.get(i);
                String name = fieldProps.getName();
                String type = fieldProps.getType();
                String s_c = fieldProps.getSimpleOrComplex();
                out.write("\tpublic static final String " + fieldProps.getStaticName() + " = \"" + fieldProps.getName() + "\";\n");
            } catch (Exception e) {//Catch exception if any
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    private static void writeGetterSetterMethods(Vector fieldsVector, BufferedWriter out) {
        for (int i = 0; i < fieldsVector.size(); i++) {
            try {
                FieldProps fieldProps = (FieldProps) fieldsVector.get(i);
                String name = fieldProps.getName();
                String staticName = fieldProps.getStaticName();
                String getterName = fieldProps.getGetterName();
                String setterName = fieldProps.getSetterName();
                String type = fieldProps.getType();
                out.write(" public " + type + " " + getterName + "() {\n");
                out.write("\treturn (" + type + ") get(" + staticName + ");\n");
                out.write(" }\n\n");

                out.write(" public void" + " " + setterName + "(" + type + " " + name + ") {\n");
                out.write("\tset(" + staticName + "," + name + ");\n");
                out.write(" }\n\n");
            } catch (Exception e) {//Catch exception if any
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    private static void writeEntityNrFunction(BufferedWriter out) throws IOException {
        out.write("  @Override \n");
        out.write(" public Long getReflectedVOEntityNr() {\n");
        out.write("\treturn null;\n");
        out.write(" }\n");
    }

    private static void writeConstructor(String className, BufferedWriter out) throws IOException {
        out.write(" public " + className + "() {\n");
        out.write(" \tsuper();\n");
        out.write(" }\n");
        out.write("\n");
    }

    private static void writeStaticBlock(Vector fieldsVector, String className, BufferedWriter out) throws IOException {
        out.write("\n");
        out.write(" static {\n");
        out.write("\tVOAttributesMap attributes = initAbstractUtilsIVOAttributes(" + className + ".class, EntityNrConstantsANDL." + className + ");\n");
        for (int i = 0; i < fieldsVector.size(); i++) {
            try {
                FieldProps fieldProps = (FieldProps) fieldsVector.get(i);
                String name = fieldProps.getName();
                String staticName = fieldProps.getStaticName();
                String type = fieldProps.getType();
                String s_c = fieldProps.getSimpleOrComplex();
                out.write("\tattributes.setAttribute(" + staticName + "," + type + ".class,IDITFieldDescriptor." + s_c + ");\n");
            } catch (Exception e) {//Catch exception if any
                System.err.println("Error: " + e.getMessage());
            }
        }

        out.write(" }\n");
        out.write("\n");
    }
}
