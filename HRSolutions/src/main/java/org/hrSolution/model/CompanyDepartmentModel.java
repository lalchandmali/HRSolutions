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
	 * Company Name
	 */
	@JsonProperty("cName")
	private String companyName;

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
	public CompanyDepartmentModel(CompanyDepartmentModelBuilder companyDeptModelbuilder) {
		this.companyName = companyDeptModelbuilder.companyName;
		this.companyDepartmentName = companyDeptModelbuilder.companyDepartmentName;
		this.companyDepartmentId = companyDeptModelbuilder.companyDepartmentId;
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
	 * Getting Company NAME
	 */
	public String getCompanyName() {
		return companyName;
	}
	
	/**
	 * Builder class for CompanyRoleModel
	 */
	public static class CompanyDepartmentModelBuilder {

		/**
		 * Company Name
		 */
		@JsonProperty("cName")
		private String companyName;

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
		public CompanyDepartmentModelBuilder companyName(String companyName) {
			this.companyName = companyName;
			return this;
		}

		/**
		 * Setting Company Department ID
		 */
		public CompanyDepartmentModelBuilder companyDepartmentId(String companyDepartmentId) {
			this.companyDepartmentId = companyDepartmentId;
			return this;
		}

		/**
		 * Setting Company Department NAME
		 */
		public CompanyDepartmentModelBuilder companyDepartmentName(String companyDepartmentName) {
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
