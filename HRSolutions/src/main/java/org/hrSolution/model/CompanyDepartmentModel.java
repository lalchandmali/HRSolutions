package org.hrSolution.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *  This class used for getter setter of Company Department with having
 *  department Name and ID
 *  We have used Builder Design Pattern for setting up variables
 *  
 *  @author  Abhimanyu Baranwal
 *  @since   14-10-2016 
 */

public class CompanyDepartmentModel {

	/**
	 * Company ID
	 */
	@JsonProperty("cId")
	private String companyID;

	/**
	 * Company Department ID
	 */
	@JsonProperty("cDId")
	private String companyDepartmentId;

	/**
	 * Company Department Name
	 */
	@JsonProperty("cDName")
	private String companyDepartmentName;

	/**
	 * Parameterized Constructor
	 */
	public CompanyDepartmentModel(CompanyDepartmentBuilder companyDeptbuilder) {
		this.companyID = companyDeptbuilder.companyID;
		this.companyDepartmentName = companyDeptbuilder.companyDepartmentName;
		this.companyDepartmentId = companyDeptbuilder.companyDepartmentId;
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
	 * Getting Company ID
	 */
	public String getcompanyID() {
		return companyID;
	}
	
	/**
	 * Builder class for CompanyDepartmentModel
	 */
	public static class CompanyDepartmentBuilder {

		/**
		 * Company ID
		 */
		@JsonProperty("cId")
		private String companyID;

		/**
		 * Company Department ID
		 */
		@JsonProperty("cDId")
		private String companyDepartmentId;

		/**
		 * Company Department Name
		 */
		@JsonProperty("cDName")
		private String companyDepartmentName;

		/**
		 * Setting Company NAME
		 */
		public CompanyDepartmentBuilder companyID(String companyID) {
			this.companyID = companyID;
			return this;
		}

		/**
		 * Setting Company Department ID
		 */
		public CompanyDepartmentBuilder companyDepartmentId(String companyDepartmentId) {
			this.companyDepartmentId = companyDepartmentId;
			return this;
		}

		/**
		 * Setting Company Department NAME
		 */
		public CompanyDepartmentBuilder companyDepartmentName(String companyDepartmentName) {
			this.companyDepartmentName = companyDepartmentName;
			return this;
		}

		/**
		 * Build Method
		 */
		public CompanyDepartmentModel build() {
			return new CompanyDepartmentModel(this);
		}

	}

}
