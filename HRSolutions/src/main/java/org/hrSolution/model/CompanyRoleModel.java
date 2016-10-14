package org.hrSolution.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *  This class used for getter setter of Company Role with access
 *  rights of Each Department.
 *  We have used Builder Design Pattern for setting up variables
 *  
 *  @author  Abhimanyu Baranwal
 *  @since   14-10-2016 
 */

public class CompanyRoleModel {
	
	/**
	 * Company Department ID
	 */
	@JsonProperty("cDId")
	private String companyDepartmentId;

	/**
	 * Company Department NAME
	 */
	@JsonProperty("cDName")
	private String companyDepartmentName;

	/**
	 * Department Access Rights
	 */
	@JsonProperty("dARights")
	private String departmentAccessRights;

	/**
	 * Parameterized Constructor
	 */
	public CompanyRoleModel(CompanyRoleModelBuilder companyRoleModelBuilder) {
		this.companyDepartmentId = companyRoleModelBuilder.companyDepartmentId;
		this.companyDepartmentName = companyRoleModelBuilder.companyDepartmentName;
		this.departmentAccessRights = companyRoleModelBuilder.departmentAccessRights;
	}

	/**
	 * Getting Company Department ID
	 */
	public String getCompanyDepartmentId() {
		return companyDepartmentId;
	}

	/**
	 * Getting Company Department NAME
	 */
	public String getCompanyDepartmentName() {
		return companyDepartmentName;
	}

	/**
	 * Getting Department Access Rights
	 */
	public String getDepartmentAccessRights() {
		return departmentAccessRights;
	}

	/**
	 * Builder class for CompanyRoleModel
	 */
	public static class CompanyRoleModelBuilder {

		/**
		 * Company Department ID
		 */
		@JsonProperty("cDId")
		private String companyDepartmentId;

		/**
		 * Company Department NAME
		 */
		@JsonProperty("cDName")
		private String companyDepartmentName;

		/**
		 * Department Access Rights
		 */
		@JsonProperty("dARights")
		private String departmentAccessRights;

		/**
		 * Setting Company Department ID
		 */
		public CompanyRoleModelBuilder setCompanyDeptId(String companyDepartmentId) {
			this.companyDepartmentId = companyDepartmentId;
			return this;
		}

		/**
		 * Setting Company Department NAME
		 */
		public CompanyRoleModelBuilder setCompanyDeptName(String companyDepartmentName) {
			this.companyDepartmentName = companyDepartmentName;
			return this;
		}

		/**
		 * Setting Department Access Rights
		 */
		public CompanyRoleModelBuilder setDeptAccessRight(String departmentAccessRights) {
			this.departmentAccessRights = departmentAccessRights;
			return this;
		}

		/**
		 * Build Method
		 */
		public CompanyRoleModel build() {
			return new CompanyRoleModel(this);
		}
	}

}
