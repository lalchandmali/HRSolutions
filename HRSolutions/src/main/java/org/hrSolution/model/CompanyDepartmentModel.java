package org.hrSolution.model;

import org.codehaus.jackson.annotate.JsonProperty;


public class CompanyDepartmentModel {

	@JsonProperty("compName")
	private String companyName;				// Company Name
	
	@JsonProperty("compDeptId")
	private String companyDepartmentId;		// Company Department ID
	
	@JsonProperty("compDeptName")
	private String companyDepartmentName;	// Company Department Name

	public CompanyDepartmentModel (CompanyDepartmentModelBuilder companydeptmodelbuilder )
	{
		this.companyName= companydeptmodelbuilder.companyName;
		this.companyName= companydeptmodelbuilder.companyName;
		this.companyName= companydeptmodelbuilder.companyName;
	}
	
	
	public String getCompanyDepartmentId() {
		return companyDepartmentId;
	}

	public String getCompanyDepartmentName() {
		return companyDepartmentName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public static class CompanyDepartmentModelBuilder {

		@JsonProperty("compName")
		private String companyName;
		
		@JsonProperty("compDeptId")
		private String companyDepartmentId;
		
		@JsonProperty("compDeptName")
		private String companyDepartmentName;

		public CompanyDepartmentModelBuilder companyName(String companyName) {
			this.companyName = companyName;
			return this;
		}

		public CompanyDepartmentModelBuilder companyDepartmentId(String companyDepartmentId) {
			this.companyDepartmentId = companyDepartmentId;
			return this;
		}

		public CompanyDepartmentModelBuilder companyDepartmentName(String preEmpPhone) {
			this.companyDepartmentName = companyDepartmentName;
			return this;
		}

		public CompanyDepartmentModel build() {
			return new CompanyDepartmentModel(this);
		}

	}
	
}
