package org.hrSolution.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class CompanyRoleModel {

	
	@JsonProperty("compDeptId")
	private String companyDepartmentId;		// Company Department ID
	
	@JsonProperty("compDeptName")
	private String companyDepartmentName;	// Company Departname NAME
	
	@JsonProperty("deptAccessRights")
	private String departmentAccessRights;	// Department Access Rights

	public CompanyRoleModel(CompanyRoleModelBuilder companyRoleModelBuilder) {
		this.companyDepartmentId=companyRoleModelBuilder.companyDepartmentId;
		this.companyDepartmentName=companyRoleModelBuilder.companyDepartmentName;
		this.departmentAccessRights=companyRoleModelBuilder.departmentAccessRights;
	}

	public String getCompanyDepartmentId() {
		return companyDepartmentId;
	}

	public String getCompanyDepartmentName() {
		return companyDepartmentName;
	}

	public String getDepartmentAccessRights() {
		return departmentAccessRights;
	}
	
	
	// Builder class of CompanyRoleModel
	public static class CompanyRoleModelBuilder {
		
		@JsonProperty("compDeptId")
		private String companyDepartmentId;
		
		@JsonProperty("compDeptName")
		private String companyDepartmentName;
		
		@JsonProperty("deptAccessRights")
		private String departmentAccessRights;
		
		public CompanyRoleModelBuilder setCompanyDeptId(String companyDepartmentId) {
			this.companyDepartmentId=companyDepartmentId;
			return this;
		}
		
		public CompanyRoleModelBuilder setCompanyDeptName(String companyDepartmentName) {
			this.companyDepartmentName=companyDepartmentName;
			return this;
		}
		
		public CompanyRoleModelBuilder setDeptAccessRight(String departmentAccessRights)
		{
			this.departmentAccessRights=departmentAccessRights;
			return this;
		}
		
		public CompanyRoleModel build()
		{
			return new CompanyRoleModel(this);
		}
	}
	
}
