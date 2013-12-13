import java.util.Locale;

/**
 * Created by IntelliJ IDEA.
 * User: Sevgi Bayraktar
 * Date: 25.11.2011
 * Time: 10:09
 * To change this template use File | Settings | File Templates.
 */
public class FieldProps {
    String name,type,simpleOrComplex;

    public String getName() {
        return name;
    }

    public String getStaticName() {
        String staticName= new String(name);

        int j=0;
        for(int i=0;i<name.length();i++,j++){
            Character c = name.charAt(i);
             if(Character.isUpperCase(c)){
                 String name_remaining = name.substring(i+1,name.length());
                 String name_header=staticName.substring(0,j)+"_"+c;
                 staticName= name_header+name_remaining;
                 j++;
             }
        }
        return staticName.toUpperCase(Locale.ENGLISH);
    }

    public String getGetterName() {
        String getterName= new String(name);
        String firstChar = name.substring(0,1);
        String remainingName = name.substring(1,name.length());

        return "get"+firstChar.toUpperCase(Locale.ENGLISH)+remainingName;
    }

    public String getSetterName() {
            String getterName= new String(name);
            String firstChar = name.substring(0,1);
            String remainingName = name.substring(1,name.length());

            return "set"+firstChar.toUpperCase(Locale.ENGLISH)+remainingName;
        }


    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSimpleOrComplex() {
        return simpleOrComplex;
    }

    public void setSimpleOrComplex(String simpleOrComplex) {
        this.simpleOrComplex = simpleOrComplex;
    }
}
