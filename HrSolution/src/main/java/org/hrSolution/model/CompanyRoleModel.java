package org.hrSolution.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class used for getter setter of Company Role with access rights of Each
 * Department. We have used Builder Design Pattern for setting up variables
 * 
 * @author Abhimanyu Baranwal
 * @since 14-10-2016
 */

@Entity
@Table(name = "ROLE")
public class CompanyRoleModel {

	/**
	 * Role ID of employee @generated
	 */
	@Id
	@JsonProperty("rid")
	private Integer roleId;

	/**
	 * Role NAME of employee e.g. manager,sr. manager
	 */
	@JsonProperty("rname")
	private String roleName;

	/**
	 * Access Rights
	 */
	@JsonProperty("rights")
	private String accessRights;

	/**
	 * Parameterized Constructor
	 */

	public CompanyRoleModel() {
		super();
	}

	public CompanyRoleModel(CompanyRoleBuilder companyRoleBuilder) {
		this.roleId = companyRoleBuilder.roleId;
		this.roleName = companyRoleBuilder.roleName;
		this.accessRights = companyRoleBuilder.accessRights;
	}

	/**
	 * Getting Role ID of employee
	 */
	public Integer getRoleId() {
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
		@JsonProperty("rid")
		private Integer roleId;

		/**
		 * Role NAME of employee
		 */
		@JsonProperty("rname")
		private String roleName;

		/**
		 * Department Access Rights
		 */
		@JsonProperty("rights")
		private String accessRights;

		/**
		 * Setting Role ID of employee
		 */
		public CompanyRoleBuilder roleId(Integer roleId) {
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
<<<<<<< HEAD

=======
		
>>>>>>> 78bc347a4a65a3cfdf42343904bba89092767193
			return new CompanyRoleModel(this);
		}
	}

}
