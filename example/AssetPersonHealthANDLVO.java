@IDITVORegistration(isVOHasJDO = false)
public class AssetPersonHealthANDLVO extends AbstractUtilsIVO {
	public static final String AS_INSURED_START_DATE = "asInsuredStartDate";
	public static final String INSURED_START_TYPE_A_N_D_L_V_O = "insuredStartTypeANDLVO";
	public static final String NO_CLAIM_TRANSFER_DISCOUNT = "noClaimTransferDiscount";
	public static final String PREVIOUS_INSURANCE_COMPANY1_V_O = "previousInsuranceCompany1VO";
	public static final String PREVIOUS_POLICY_START_DATE1 = "previousPolicyStartDate1";
	public static final String PREVIOUS_POLICY_END_DATE1 = "previousPolicyEndDate1";
	public static final String PREVIOUS_INSURANCE_COMPANY2_V_O = "previousInsuranceCompany2VO";
	public static final String PREVIOUS_POLICY_START_DATE2 = "previousPolicyStartDate2";
	public static final String PREVIOUS_POLICY_END_DATE2 = "previousPolicyEndDate2";
	public static final String PREVIOUS_INSURANCE_COMPANY3_V_O = "previousInsuranceCompany3VO";
	public static final String PREVIOUS_POLICY_START_DATE3 = "previousPolicyStartDate3";
	public static final String PREVIOUS_POLICY_END_DATE3 = "previousPolicyEndDate3";
	public static final String IS_LIFE_TIME_RENEWAL_GUAANTEE = "isLifeTimeRenewalGuaantee";
	public static final String LIFE_TIME_GUAANTEE_DATE = "lifeTimeGuaanteeDate";
	public static final String IS_LIFE_TIME_GURANTEE_TRANSFERRED = "isLifeTimeGuranteeTransferred";
	public static final String PROVISION_OPEN_CLOSE_A_N_D_L_V_O = "provisionOpenCloseANDLVO";
	public static final String PERSONAL_SECURITY_NUMBER = "personalSecurityNumber";
	public static final String MATERNITY_EXEMPTION = "maternityExemption";
	public static final String MATERNITY_EXEMPTION_END_DATE = "maternityExemptionEndDate";
	public static final String PREMIUM_IN_PREVIOUS_TERM = "premiumInPreviousTerm";
	public static final String LOSS_PREMIUM_RATIO_IN_PREVIOUS_TERM = "lossPremiumRatioInPreviousTerm";
	public static final String LOSS_PREMIUM_RATIO2_YEARS_AGO = "lossPremiumRatio2YearsAgo";
	public static final String LOSS_PREMIUM_RATIO3_YEARS_AGO = "lossPremiumRatio3YearsAgo";
	public static final String LOSS_PREMIUM_RATIO4_YEARS_AGO = "lossPremiumRatio4YearsAgo";
	public static final String CANCEL_LOSS_PROFIT_FOR_S_G_K = "cancelLossProfitForSGK";
	public static final String GROUP_DISCOUNT = "groupDiscount";
	public static final String NO_CARDS_PRINTED = "noCardsPrinted";
	public static final String MEMBERSHIP_DISCOUNT = "membershipDiscount";
	public static final String MEMBERSHIP_USED_FOR_DISCOUNT = "membershipUsedForDiscount";
	public static final String CUSTOMER_SCORE = "customerScore";
	public static final String CHECK_UP = "checkUp";
	public static final String CHECK_UP_INVOICE_NUMBER = "checkUpInvoiceNumber";
	public static final String CHECK_UP_AMOUNT_OF_INVOICE = "checkUpAmountOfInvoice";
	public static final String CHECK_UP_HEALTH_INSTITUTION_NAME = "checkUpHealthInstitutionName";
	public static final String CHECK_UP_HEALTH_INSTITUTION_CODE = "checkUpHealthInstitutionCode";
	public static final String ILLNESS_TYPE_A_N_D_L_V_O = "illnessTypeANDLVO";
	public static final String ILLNESS_A_N_D_L_V_O = "illnessANDLVO";
	public static final String ILLNESS_SURCHARGE = "illnessSurcharge";
	public static final String ILLNESS_LIMIT = "illnessLimit";
	public static final String ILLNESS_EXCLUDE_START_DATE = "illnessExcludeStartDate";
	public static final String ILLNESS_EXCLUDE_END_DATE = "illnessExcludeEndDate";
	public static final String USE_OF_ALCOHOL = "useOfAlcohol";
	public static final String HAD_SURGERY = "hadSurgery";
	public static final String COMPLETED_MILITARY_SERVICE = "completedMilitaryService";
	public static final String FAMILY_HAS_HEART_DIABETES = "familyHasHeartDiabetes";
	public static final String HAD_HAD_HEALTH_INSURANCE = "hadHadHealthInsurance";
	public static final String CHECKED_AN_ILLNESS_IN_THE_FORM = "checkedAnIllnessInTheForm";
	public static final String HAS_GENETIC_ILLNESS_OR_HANDICAP = "hasGeneticIllnessOrHandicap";
	public static final String IS_LICENCED_SPORTS_PERSON = "isLicencedSportsPerson";
	public static final String WAS_EXEMINED_RECENTLY = "wasExeminedRecently";
	public static final String IS_NOT_PERFECTLY_HEALTHY_NOW = "isNotPerfectlyHealthyNow";
	public static final String HAS_HEALTH_PROBLEMS_USED_MEDICATION = "hasHealthProblemsUsedMedication";
	public static final String HEALTH_DECLARATION_DETAILS = "healthDeclarationDetails";

 static {
	VOAttributesMap attributes = initAbstractUtilsIVOAttributes(AssetPersonHealthANDLVO.class, EntityNrConstantsANDL.AssetPersonHealthANDLVO);
	attributes.setAttribute(AS_INSURED_START_DATE,Date.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(INSURED_START_TYPE_A_N_D_L_V_O,TInsuredStartTypeANDLVO.class,IDITFieldDescriptor.INNER_VO);
	attributes.setAttribute(NO_CLAIM_TRANSFER_DISCOUNT,BigDecimal.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(PREVIOUS_INSURANCE_COMPANY1_V_O,ContactANDLVO.class,IDITFieldDescriptor.INNER_VO);
	attributes.setAttribute(PREVIOUS_POLICY_START_DATE1,Date.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(PREVIOUS_POLICY_END_DATE1,Date.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(PREVIOUS_INSURANCE_COMPANY2_V_O,ContactANDLVO.class,IDITFieldDescriptor.INNER_VO);
	attributes.setAttribute(PREVIOUS_POLICY_START_DATE2,Date.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(PREVIOUS_POLICY_END_DATE2,Date.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(PREVIOUS_INSURANCE_COMPANY3_V_O,ContactANDLVO.class,IDITFieldDescriptor.INNER_VO);
	attributes.setAttribute(PREVIOUS_POLICY_START_DATE3,Date.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(PREVIOUS_POLICY_END_DATE3,Date.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(IS_LIFE_TIME_RENEWAL_GUAANTEE,Boolean.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(LIFE_TIME_GUAANTEE_DATE,Date.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(IS_LIFE_TIME_GURANTEE_TRANSFERRED,Boolean.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(PROVISION_OPEN_CLOSE_A_N_D_L_V_O,TProvisionOpenCloseANDLVO.class,IDITFieldDescriptor.INNER_VO);
	attributes.setAttribute(PERSONAL_SECURITY_NUMBER,String.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(MATERNITY_EXEMPTION,Boolean.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(MATERNITY_EXEMPTION_END_DATE,Date.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(PREMIUM_IN_PREVIOUS_TERM,BigDecimal.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(LOSS_PREMIUM_RATIO_IN_PREVIOUS_TERM,BigDecimal.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(LOSS_PREMIUM_RATIO2_YEARS_AGO,BigDecimal.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(LOSS_PREMIUM_RATIO3_YEARS_AGO,BigDecimal.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(LOSS_PREMIUM_RATIO4_YEARS_AGO,BigDecimal.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(CANCEL_LOSS_PROFIT_FOR_S_G_K,BigDecimal.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(GROUP_DISCOUNT,BigDecimal.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(NO_CARDS_PRINTED,Boolean.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(MEMBERSHIP_DISCOUNT,BigDecimal.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(MEMBERSHIP_USED_FOR_DISCOUNT,Boolean.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(CUSTOMER_SCORE,Integer.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(CHECK_UP,Boolean.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(CHECK_UP_INVOICE_NUMBER,String.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(CHECK_UP_AMOUNT_OF_INVOICE,BigDecimal.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(CHECK_UP_HEALTH_INSTITUTION_NAME,String.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(CHECK_UP_HEALTH_INSTITUTION_CODE,String.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(ILLNESS_TYPE_A_N_D_L_V_O,TIllnessTypeANDLVO.class,IDITFieldDescriptor.INNER_VO);
	attributes.setAttribute(ILLNESS_A_N_D_L_V_O,TIllnessANDLVO.class,IDITFieldDescriptor.INNER_VO);
	attributes.setAttribute(ILLNESS_SURCHARGE,BigDecimal.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(ILLNESS_LIMIT,BigDecimal.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(ILLNESS_EXCLUDE_START_DATE,Date.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(ILLNESS_EXCLUDE_END_DATE,Date.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(USE_OF_ALCOHOL,Boolean.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(HAD_SURGERY,Boolean.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(COMPLETED_MILITARY_SERVICE,Boolean.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(FAMILY_HAS_HEART_DIABETES,Boolean.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(HAD_HAD_HEALTH_INSURANCE,Boolean.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(CHECKED_AN_ILLNESS_IN_THE_FORM,Boolean.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(HAS_GENETIC_ILLNESS_OR_HANDICAP,Boolean.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(IS_LICENCED_SPORTS_PERSON,Boolean.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(WAS_EXEMINED_RECENTLY,Boolean.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(IS_NOT_PERFECTLY_HEALTHY_NOW,Boolean.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(HAS_HEALTH_PROBLEMS_USED_MEDICATION,Boolean.class,IDITFieldDescriptor.SIMPLE);
	attributes.setAttribute(HEALTH_DECLARATION_DETAILS,Boolean.class,IDITFieldDescriptor.SIMPLE);
 }

 public AssetPersonHealthANDLVO() {
 	super();
 }

  @Override 
 public Long getReflectedVOEntityNr() {
	return null;
 }
 public Date getAsInsuredStartDate() {
	return (Date) get(AS_INSURED_START_DATE);
 }

 public void setAsInsuredStartDate(Date asInsuredStartDate) {
	set(AS_INSURED_START_DATE,asInsuredStartDate);
 }

 public TInsuredStartTypeANDLVO getInsuredStartTypeANDLVO() {
	return (TInsuredStartTypeANDLVO) get(INSURED_START_TYPE_A_N_D_L_V_O);
 }

 public void setInsuredStartTypeANDLVO(TInsuredStartTypeANDLVO insuredStartTypeANDLVO) {
	set(INSURED_START_TYPE_A_N_D_L_V_O,insuredStartTypeANDLVO);
 }

 public BigDecimal getNoClaimTransferDiscount() {
	return (BigDecimal) get(NO_CLAIM_TRANSFER_DISCOUNT);
 }

 public void setNoClaimTransferDiscount(BigDecimal noClaimTransferDiscount) {
	set(NO_CLAIM_TRANSFER_DISCOUNT,noClaimTransferDiscount);
 }

 public ContactANDLVO getPreviousInsuranceCompany1VO() {
	return (ContactANDLVO) get(PREVIOUS_INSURANCE_COMPANY1_V_O);
 }

 public void setPreviousInsuranceCompany1VO(ContactANDLVO previousInsuranceCompany1VO) {
	set(PREVIOUS_INSURANCE_COMPANY1_V_O,previousInsuranceCompany1VO);
 }

 public Date getPreviousPolicyStartDate1() {
	return (Date) get(PREVIOUS_POLICY_START_DATE1);
 }

 public void setPreviousPolicyStartDate1(Date previousPolicyStartDate1) {
	set(PREVIOUS_POLICY_START_DATE1,previousPolicyStartDate1);
 }

 public Date getPreviousPolicyEndDate1() {
	return (Date) get(PREVIOUS_POLICY_END_DATE1);
 }

 public void setPreviousPolicyEndDate1(Date previousPolicyEndDate1) {
	set(PREVIOUS_POLICY_END_DATE1,previousPolicyEndDate1);
 }

 public ContactANDLVO getPreviousInsuranceCompany2VO() {
	return (ContactANDLVO) get(PREVIOUS_INSURANCE_COMPANY2_V_O);
 }

 public void setPreviousInsuranceCompany2VO(ContactANDLVO previousInsuranceCompany2VO) {
	set(PREVIOUS_INSURANCE_COMPANY2_V_O,previousInsuranceCompany2VO);
 }

 public Date getPreviousPolicyStartDate2() {
	return (Date) get(PREVIOUS_POLICY_START_DATE2);
 }

 public void setPreviousPolicyStartDate2(Date previousPolicyStartDate2) {
	set(PREVIOUS_POLICY_START_DATE2,previousPolicyStartDate2);
 }

 public Date getPreviousPolicyEndDate2() {
	return (Date) get(PREVIOUS_POLICY_END_DATE2);
 }

 public void setPreviousPolicyEndDate2(Date previousPolicyEndDate2) {
	set(PREVIOUS_POLICY_END_DATE2,previousPolicyEndDate2);
 }

 public ContactANDLVO getPreviousInsuranceCompany3VO() {
	return (ContactANDLVO) get(PREVIOUS_INSURANCE_COMPANY3_V_O);
 }

 public void setPreviousInsuranceCompany3VO(ContactANDLVO previousInsuranceCompany3VO) {
	set(PREVIOUS_INSURANCE_COMPANY3_V_O,previousInsuranceCompany3VO);
 }

 public Date getPreviousPolicyStartDate3() {
	return (Date) get(PREVIOUS_POLICY_START_DATE3);
 }

 public void setPreviousPolicyStartDate3(Date previousPolicyStartDate3) {
	set(PREVIOUS_POLICY_START_DATE3,previousPolicyStartDate3);
 }

 public Date getPreviousPolicyEndDate3() {
	return (Date) get(PREVIOUS_POLICY_END_DATE3);
 }

 public void setPreviousPolicyEndDate3(Date previousPolicyEndDate3) {
	set(PREVIOUS_POLICY_END_DATE3,previousPolicyEndDate3);
 }

 public Boolean getIsLifeTimeRenewalGuaantee() {
	return (Boolean) get(IS_LIFE_TIME_RENEWAL_GUAANTEE);
 }

 public void setIsLifeTimeRenewalGuaantee(Boolean isLifeTimeRenewalGuaantee) {
	set(IS_LIFE_TIME_RENEWAL_GUAANTEE,isLifeTimeRenewalGuaantee);
 }

 public Date getLifeTimeGuaanteeDate() {
	return (Date) get(LIFE_TIME_GUAANTEE_DATE);
 }

 public void setLifeTimeGuaanteeDate(Date lifeTimeGuaanteeDate) {
	set(LIFE_TIME_GUAANTEE_DATE,lifeTimeGuaanteeDate);
 }

 public Boolean getIsLifeTimeGuranteeTransferred() {
	return (Boolean) get(IS_LIFE_TIME_GURANTEE_TRANSFERRED);
 }

 public void setIsLifeTimeGuranteeTransferred(Boolean isLifeTimeGuranteeTransferred) {
	set(IS_LIFE_TIME_GURANTEE_TRANSFERRED,isLifeTimeGuranteeTransferred);
 }

 public TProvisionOpenCloseANDLVO getProvisionOpenCloseANDLVO() {
	return (TProvisionOpenCloseANDLVO) get(PROVISION_OPEN_CLOSE_A_N_D_L_V_O);
 }

 public void setProvisionOpenCloseANDLVO(TProvisionOpenCloseANDLVO provisionOpenCloseANDLVO) {
	set(PROVISION_OPEN_CLOSE_A_N_D_L_V_O,provisionOpenCloseANDLVO);
 }

 public String getPersonalSecurityNumber() {
	return (String) get(PERSONAL_SECURITY_NUMBER);
 }

 public void setPersonalSecurityNumber(String personalSecurityNumber) {
	set(PERSONAL_SECURITY_NUMBER,personalSecurityNumber);
 }

 public Boolean getMaternityExemption() {
	return (Boolean) get(MATERNITY_EXEMPTION);
 }

 public void setMaternityExemption(Boolean maternityExemption) {
	set(MATERNITY_EXEMPTION,maternityExemption);
 }

 public Date getMaternityExemptionEndDate() {
	return (Date) get(MATERNITY_EXEMPTION_END_DATE);
 }

 public void setMaternityExemptionEndDate(Date maternityExemptionEndDate) {
	set(MATERNITY_EXEMPTION_END_DATE,maternityExemptionEndDate);
 }

 public BigDecimal getPremiumInPreviousTerm() {
	return (BigDecimal) get(PREMIUM_IN_PREVIOUS_TERM);
 }

 public void setPremiumInPreviousTerm(BigDecimal premiumInPreviousTerm) {
	set(PREMIUM_IN_PREVIOUS_TERM,premiumInPreviousTerm);
 }

 public BigDecimal getLossPremiumRatioInPreviousTerm() {
	return (BigDecimal) get(LOSS_PREMIUM_RATIO_IN_PREVIOUS_TERM);
 }

 public void setLossPremiumRatioInPreviousTerm(BigDecimal lossPremiumRatioInPreviousTerm) {
	set(LOSS_PREMIUM_RATIO_IN_PREVIOUS_TERM,lossPremiumRatioInPreviousTerm);
 }

 public BigDecimal getLossPremiumRatio2YearsAgo() {
	return (BigDecimal) get(LOSS_PREMIUM_RATIO2_YEARS_AGO);
 }

 public void setLossPremiumRatio2YearsAgo(BigDecimal lossPremiumRatio2YearsAgo) {
	set(LOSS_PREMIUM_RATIO2_YEARS_AGO,lossPremiumRatio2YearsAgo);
 }

 public BigDecimal getLossPremiumRatio3YearsAgo() {
	return (BigDecimal) get(LOSS_PREMIUM_RATIO3_YEARS_AGO);
 }

 public void setLossPremiumRatio3YearsAgo(BigDecimal lossPremiumRatio3YearsAgo) {
	set(LOSS_PREMIUM_RATIO3_YEARS_AGO,lossPremiumRatio3YearsAgo);
 }

 public BigDecimal getLossPremiumRatio4YearsAgo() {
	return (BigDecimal) get(LOSS_PREMIUM_RATIO4_YEARS_AGO);
 }

 public void setLossPremiumRatio4YearsAgo(BigDecimal lossPremiumRatio4YearsAgo) {
	set(LOSS_PREMIUM_RATIO4_YEARS_AGO,lossPremiumRatio4YearsAgo);
 }

 public BigDecimal getCancelLossProfitForSGK() {
	return (BigDecimal) get(CANCEL_LOSS_PROFIT_FOR_S_G_K);
 }

 public void setCancelLossProfitForSGK(BigDecimal cancelLossProfitForSGK) {
	set(CANCEL_LOSS_PROFIT_FOR_S_G_K,cancelLossProfitForSGK);
 }

 public BigDecimal getGroupDiscount() {
	return (BigDecimal) get(GROUP_DISCOUNT);
 }

 public void setGroupDiscount(BigDecimal groupDiscount) {
	set(GROUP_DISCOUNT,groupDiscount);
 }

 public Boolean getNoCardsPrinted() {
	return (Boolean) get(NO_CARDS_PRINTED);
 }

 public void setNoCardsPrinted(Boolean noCardsPrinted) {
	set(NO_CARDS_PRINTED,noCardsPrinted);
 }

 public BigDecimal getMembershipDiscount() {
	return (BigDecimal) get(MEMBERSHIP_DISCOUNT);
 }

 public void setMembershipDiscount(BigDecimal membershipDiscount) {
	set(MEMBERSHIP_DISCOUNT,membershipDiscount);
 }

 public Boolean getMembershipUsedForDiscount() {
	return (Boolean) get(MEMBERSHIP_USED_FOR_DISCOUNT);
 }

 public void setMembershipUsedForDiscount(Boolean membershipUsedForDiscount) {
	set(MEMBERSHIP_USED_FOR_DISCOUNT,membershipUsedForDiscount);
 }

 public Integer getCustomerScore() {
	return (Integer) get(CUSTOMER_SCORE);
 }

 public void setCustomerScore(Integer customerScore) {
	set(CUSTOMER_SCORE,customerScore);
 }

 public Boolean getCheckUp() {
	return (Boolean) get(CHECK_UP);
 }

 public void setCheckUp(Boolean checkUp) {
	set(CHECK_UP,checkUp);
 }

 public String getCheckUpInvoiceNumber() {
	return (String) get(CHECK_UP_INVOICE_NUMBER);
 }

 public void setCheckUpInvoiceNumber(String checkUpInvoiceNumber) {
	set(CHECK_UP_INVOICE_NUMBER,checkUpInvoiceNumber);
 }

 public BigDecimal getCheckUpAmountOfInvoice() {
	return (BigDecimal) get(CHECK_UP_AMOUNT_OF_INVOICE);
 }

 public void setCheckUpAmountOfInvoice(BigDecimal checkUpAmountOfInvoice) {
	set(CHECK_UP_AMOUNT_OF_INVOICE,checkUpAmountOfInvoice);
 }

 public String getCheckUpHealthInstitutionName() {
	return (String) get(CHECK_UP_HEALTH_INSTITUTION_NAME);
 }

 public void setCheckUpHealthInstitutionName(String checkUpHealthInstitutionName) {
	set(CHECK_UP_HEALTH_INSTITUTION_NAME,checkUpHealthInstitutionName);
 }

 public String getCheckUpHealthInstitutionCode() {
	return (String) get(CHECK_UP_HEALTH_INSTITUTION_CODE);
 }

 public void setCheckUpHealthInstitutionCode(String checkUpHealthInstitutionCode) {
	set(CHECK_UP_HEALTH_INSTITUTION_CODE,checkUpHealthInstitutionCode);
 }

 public TIllnessTypeANDLVO getIllnessTypeANDLVO() {
	return (TIllnessTypeANDLVO) get(ILLNESS_TYPE_A_N_D_L_V_O);
 }

 public void setIllnessTypeANDLVO(TIllnessTypeANDLVO illnessTypeANDLVO) {
	set(ILLNESS_TYPE_A_N_D_L_V_O,illnessTypeANDLVO);
 }

 public TIllnessANDLVO getIllnessANDLVO() {
	return (TIllnessANDLVO) get(ILLNESS_A_N_D_L_V_O);
 }

 public void setIllnessANDLVO(TIllnessANDLVO illnessANDLVO) {
	set(ILLNESS_A_N_D_L_V_O,illnessANDLVO);
 }

 public BigDecimal getIllnessSurcharge() {
	return (BigDecimal) get(ILLNESS_SURCHARGE);
 }

 public void setIllnessSurcharge(BigDecimal illnessSurcharge) {
	set(ILLNESS_SURCHARGE,illnessSurcharge);
 }

 public BigDecimal getIllnessLimit() {
	return (BigDecimal) get(ILLNESS_LIMIT);
 }

 public void setIllnessLimit(BigDecimal illnessLimit) {
	set(ILLNESS_LIMIT,illnessLimit);
 }

 public Date getIllnessExcludeStartDate() {
	return (Date) get(ILLNESS_EXCLUDE_START_DATE);
 }

 public void setIllnessExcludeStartDate(Date illnessExcludeStartDate) {
	set(ILLNESS_EXCLUDE_START_DATE,illnessExcludeStartDate);
 }

 public Date getIllnessExcludeEndDate() {
	return (Date) get(ILLNESS_EXCLUDE_END_DATE);
 }

 public void setIllnessExcludeEndDate(Date illnessExcludeEndDate) {
	set(ILLNESS_EXCLUDE_END_DATE,illnessExcludeEndDate);
 }

 public Boolean getUseOfAlcohol() {
	return (Boolean) get(USE_OF_ALCOHOL);
 }

 public void setUseOfAlcohol(Boolean useOfAlcohol) {
	set(USE_OF_ALCOHOL,useOfAlcohol);
 }

 public Boolean getHadSurgery() {
	return (Boolean) get(HAD_SURGERY);
 }

 public void setHadSurgery(Boolean hadSurgery) {
	set(HAD_SURGERY,hadSurgery);
 }

 public Boolean getCompletedMilitaryService() {
	return (Boolean) get(COMPLETED_MILITARY_SERVICE);
 }

 public void setCompletedMilitaryService(Boolean completedMilitaryService) {
	set(COMPLETED_MILITARY_SERVICE,completedMilitaryService);
 }

 public Boolean getFamilyHasHeartDiabetes() {
	return (Boolean) get(FAMILY_HAS_HEART_DIABETES);
 }

 public void setFamilyHasHeartDiabetes(Boolean familyHasHeartDiabetes) {
	set(FAMILY_HAS_HEART_DIABETES,familyHasHeartDiabetes);
 }

 public Boolean getHadHadHealthInsurance() {
	return (Boolean) get(HAD_HAD_HEALTH_INSURANCE);
 }

 public void setHadHadHealthInsurance(Boolean hadHadHealthInsurance) {
	set(HAD_HAD_HEALTH_INSURANCE,hadHadHealthInsurance);
 }

 public Boolean getCheckedAnIllnessInTheForm() {
	return (Boolean) get(CHECKED_AN_ILLNESS_IN_THE_FORM);
 }

 public void setCheckedAnIllnessInTheForm(Boolean checkedAnIllnessInTheForm) {
	set(CHECKED_AN_ILLNESS_IN_THE_FORM,checkedAnIllnessInTheForm);
 }

 public Boolean getHasGeneticIllnessOrHandicap() {
	return (Boolean) get(HAS_GENETIC_ILLNESS_OR_HANDICAP);
 }

 public void setHasGeneticIllnessOrHandicap(Boolean hasGeneticIllnessOrHandicap) {
	set(HAS_GENETIC_ILLNESS_OR_HANDICAP,hasGeneticIllnessOrHandicap);
 }

 public Boolean getIsLicencedSportsPerson() {
	return (Boolean) get(IS_LICENCED_SPORTS_PERSON);
 }

 public void setIsLicencedSportsPerson(Boolean isLicencedSportsPerson) {
	set(IS_LICENCED_SPORTS_PERSON,isLicencedSportsPerson);
 }

 public Boolean getWasExeminedRecently() {
	return (Boolean) get(WAS_EXEMINED_RECENTLY);
 }

 public void setWasExeminedRecently(Boolean wasExeminedRecently) {
	set(WAS_EXEMINED_RECENTLY,wasExeminedRecently);
 }

 public Boolean getIsNotPerfectlyHealthyNow() {
	return (Boolean) get(IS_NOT_PERFECTLY_HEALTHY_NOW);
 }

 public void setIsNotPerfectlyHealthyNow(Boolean isNotPerfectlyHealthyNow) {
	set(IS_NOT_PERFECTLY_HEALTHY_NOW,isNotPerfectlyHealthyNow);
 }

 public Boolean getHasHealthProblemsUsedMedication() {
	return (Boolean) get(HAS_HEALTH_PROBLEMS_USED_MEDICATION);
 }

 public void setHasHealthProblemsUsedMedication(Boolean hasHealthProblemsUsedMedication) {
	set(HAS_HEALTH_PROBLEMS_USED_MEDICATION,hasHealthProblemsUsedMedication);
 }

 public Boolean getHealthDeclarationDetails() {
	return (Boolean) get(HEALTH_DECLARATION_DETAILS);
 }

 public void setHealthDeclarationDetails(Boolean healthDeclarationDetails) {
	set(HEALTH_DECLARATION_DETAILS,healthDeclarationDetails);
 }

} 