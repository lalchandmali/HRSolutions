package org.hrSolution.status.constant;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Lalchand Mali
 * */

public abstract class PreEmployeeDocVarConstant {
	
public static Map<String,String> docVariables=new HashMap<String,String>();
public static Map<String,String> getDocVariables(){
	
	docVariables.put("employeeMail", "{EMAIL}");
	docVariables.put("appliedPosition", "{APOS}");
	docVariables.put("interstedPosition", "{IPOS}");
	docVariables.put("preEmployeeGender", "{GEN}");
	docVariables.put("preEmployeeDateOfBirth", "{DOB}");
	docVariables.put("preEmployeeMaritalStatus", "{PMS}");
	docVariables.put("preEmployeeNationality", "{PNAT}");
	docVariables.put("preEmployeeCountryOfBirth", "{PCOB}");
	docVariables.put("preEmployeeHealthStatus", "{PHS}");
	docVariables.put("preEmployeeCriminalRecord", "{PCR}");
	docVariables.put("preEmployeePassportNo", "{PPN}");
	docVariables.put("preEmployeeEmergencyContactName", "{PECN}");
	docVariables.put("preEmployeeEmergencyPhoneNumber", "{PEPN}");
	docVariables.put("preEmployeeEmergencyContactRelationship", "{PECR}");
	docVariables.put("preEmployeeHighestEducation", "{PHE}");
	docVariables.put("preEmployeeUniversity", "{PU}");
	docVariables.put("preEmployeeGraduationYear", "{PGY}");
	docVariables.put("preEmployeeMajor", "{PM}");
	docVariables.put("preEmployeePresentAddress", "{PPA}");
	docVariables.put("preEmployeeZipCode", "{PZC}");
	docVariables.put("preEmployeeBaseSalary", "{PBS}");
	docVariables.put("preEmployeeBonus", "{PB}");
	docVariables.put("preEmployeeStocksOrOption", "{PSO}");
	docVariables.put("preEmployeeOtherRewards", "{POR}");
	docVariables.put("preEmployeeExpectedJoining", "{PEJ}");
	docVariables.put("preEmployeeRelativesWrkComp", "{PRWC}");
	docVariables.put("preEmployeeRelativeName", "{PRN}");
	docVariables.put("preEmployeeRelativeRelationship", "{PRR}");
	docVariables.put("employeeName", "{NAME}");
	
	return docVariables;
}


}
