package org.hrSolution.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeDetailModel {
	/**
	 * Employee name variable declaration
	 */
	@JsonProperty("ename")
	private String employeeName;
	/**
	 * The email of employee
	 */
	@JsonProperty("email")
	private String employeeMail;
	/**
	 * Company Id
	 * */
	@JsonProperty("cId")
	private Long companyId;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeMail() {
		return employeeMail;
	}

	public void setEmployeeMail(String employeeMail) {
		this.employeeMail = employeeMail;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

}
