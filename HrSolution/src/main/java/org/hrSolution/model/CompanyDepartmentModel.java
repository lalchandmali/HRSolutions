package org.hrSolution.model;

<<<<<<< HEAD
=======
//import java.io.Serializable;

>>>>>>> 78bc347a4a65a3cfdf42343904bba89092767193
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class used for getter setter of Company Department with having
 * department Name and ID We have used Builder Design Pattern for setting up
 * variables
 * 
 * @author Abhimanyu Baranwal
 * @since 14-10-2016
 */

@Entity
@Table(name = "DEPARTMENT")
<<<<<<< HEAD
public class CompanyDepartmentModel {
=======
public class CompanyDepartmentModel/* implements Serializable*/{
>>>>>>> 78bc347a4a65a3cfdf42343904bba89092767193

	/**
	 * 
	 */
<<<<<<< HEAD
	// private static final long serialVersionUID = 1L;
=======
	//private static final long serialVersionUID = 1L;
>>>>>>> 78bc347a4a65a3cfdf42343904bba89092767193

	/**
	 * Company ID
	 */
	@Id
	@JsonProperty("cid")
	private Integer companyID;

	/**
	 * Company Department ID
	 */
	@Id
	@JsonProperty("did")
	private Integer companyDepartmentId;

	/**
	 * Company Department Name
	 */
	@JsonProperty("cdname")
	private String companyDepartmentName;

	public CompanyDepartmentModel() {
		super();

	}

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
	public Integer getCompanyDepartmentId() {
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
	public Integer getcompanyID() {
		return companyID;
	}

	/**
	 * Builder class for CompanyDepartmentModel
	 */
	public static class CompanyDepartmentBuilder {

		/**
		 * Company ID
		 */
		@JsonProperty("cid")
		private Integer companyID;

		/**
		 * Company Department ID
		 */
		@JsonProperty("did")
		private Integer companyDepartmentId;

		/**
		 * Company Department Name
		 */
		@JsonProperty("cdname")
		private String companyDepartmentName;

		/**
		 * Setting Company NAME
		 */
		public CompanyDepartmentBuilder companyID(Integer companyID) {
			this.companyID = companyID;
			return this;
		}

		/**
		 * Setting Company Department ID
		 */
		public CompanyDepartmentBuilder companyDepartmentId(Integer companyDepartmentId) {
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
