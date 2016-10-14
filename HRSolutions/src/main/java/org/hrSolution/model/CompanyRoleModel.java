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
	 * Role ID of employee @generated
	 */
	@JsonProperty("rId")
	private String roleId;

	/**
	 * Role NAME of employee e.g. manager,sr. manager
	 */
	@JsonProperty("rName")
	private String roleName;

	/**
	 *  Access Rights
	 */
	@JsonProperty("aRights")
	private String accessRights;

	/**
	 * Parameterized Constructor
	 */
	public CompanyRoleModel(CompanyRoleBuilder companyRoleBuilder) {
		this.roleId = companyRoleBuilder.roleId;
		this.roleName = companyRoleBuilder.roleName;
		this.accessRights = companyRoleBuilder.accessRights;
	}

	/**
	 * Getting Role ID of employee
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * Getting Role NAME of employee
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * Getting Access Rights
	 */
	public String getAccessRights() {
		return accessRights;
	}

	/**
	 * Builder class for CompanyRoleModel
	 */
	public static class CompanyRoleBuilder {

		/**
		 * Role ID of employee
		 */
		@JsonProperty("rId")
		private String roleId;

		/**
		 * Role NAME of employee
		 */
		@JsonProperty("rName")
		private String roleName;

		/**
		 * Department Access Rights
		 */
		@JsonProperty("aRights")
		private String accessRights;

		/**
		 * Setting Role ID of employee
		 */
		public CompanyRoleBuilder roleId(String roleId) {
			this.roleId = roleId;
			return this;
		}

		/**
		 * Setting Role NAME of employee
		 */
		public CompanyRoleBuilder roleName(String roleName) {
			this.roleName = roleName;
			return this;
		}

		/**
		 * Setting Access Rights
		 */
		public CompanyRoleBuilder accessRight(String accessRights) {
			this.accessRights = accessRights;
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
