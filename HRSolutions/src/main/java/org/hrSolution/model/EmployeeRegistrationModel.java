package org.hrSolution.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This model class is used for setting and getting variable for
 * Employee means Employee is already member of company
 * */
/**
 * @author lalchand Mali
 *
 */
public class EmployeeRegistrationModel {

	/**
	 * class attributes declarations
	 */
	/**
	 * Employee Id variable declaration
	 */
	@JsonProperty("eid")
	private String employeeId;

	/**
	 * Employee name variable declaration
	 */
	@JsonProperty("ename")
	private String employeeName;

	/**
	 * Employee roleId (e.g. HR, Senior Manager,Manager,Lead) variable
	 * declaration
	 */
	@JsonProperty("rid")
	private Integer roleId;

	/**
	 * Employee department Id variable declaration
	 */
	@JsonProperty("did")
	private Integer departmentId;

	/**
	 * Employee Company Id variable declaration
	 */
	@JsonProperty("cid")
	private String companyId;

	/**
	 * Employee Mail Id variable declaration
	 */
	@JsonProperty("mid")
	private String mailId;

	/**
	 * Employee Password variable declaration
	 */
	@JsonProperty("pwd")
	private String password;

	/** Parameterized constructor for setting attributes values */
	public EmployeeRegistrationModel(EmployeeRegistrationBuilder employeeRegistrationBuilder) {

		this.employeeId = employeeRegistrationBuilder.employeeId;
		this.employeeName = employeeRegistrationBuilder.employeeName;
		this.roleId = employeeRegistrationBuilder.roleId;
		this.departmentId = employeeRegistrationBuilder.departmentId;
		this.companyId = employeeRegistrationBuilder.companyId;
		this.mailId = employeeRegistrationBuilder.mailId;
		this.password = employeeRegistrationBuilder.password;
	}

	/** Getting Employee Id */
	public String getEmployeeId() {
		return employeeId;
	}

	/** Getting Employee name */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * Getting Role Id HR or Senior manager or manager or Lead or Head
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/** Getting department Id */
	public Integer getDepartmentId() {
		return departmentId;
	}

	/** Getting company Id */
	public String getCompanyId() {
		return companyId;
	}

	/** Getting mail Id */
	public String getMailId() {
		return mailId;
	}

	/** Getting password */
	public String getPassword() {
		return password;
	}

	/* EmployeeRegistrationBuilder class for building the result */
	public static class EmployeeRegistrationBuilder {
		/**
		 * class attributes declarations
		 */
		/**
		 * Employee Id variable declaration
		 */
		@JsonProperty("eid")
		private String employeeId;

		/**
		 * Employee name variable declaration
		 */
		@JsonProperty("ename")
		private String employeeName;

		/**
		 * Employee roleId (e.g. HR, Senior Manager,Manager,Lead) variable
		 * declaration
		 */
		@JsonProperty("rid")
		private Integer roleId;

		/**
		 * Employee department Id variable declaration
		 */
		@JsonProperty("did")
		private Integer departmentId;

		/**
		 * Employee Company Id variable declaration
		 */
		@JsonProperty("cid")
		private String companyId;

		/**
		 * Employee Mail Id variable declaration
		 */
		@JsonProperty("mid")
		private String mailId;

		/**
		 * Employee Password variable declaration
		 */
		@JsonProperty("pwd")
		private String password;

		/** Setting Employee name by Builder */
		public EmployeeRegistrationBuilder empName(String employeeName) {
			this.employeeName = employeeName;
			return this;
		}

		/** Setting Employee mail by Builder */
		public EmployeeRegistrationBuilder employeeId(String employeeId) {
			this.employeeId = employeeId;
			return this;
		}

		/** Setting Employee mail by Builder */
		public EmployeeRegistrationBuilder mailId(String mailId) {
			this.mailId = mailId;
			return this;
		}

		/* Setting Employee mail by Builder */
		public EmployeeRegistrationBuilder companyId(String companyId) {
			this.companyId = companyId;
			return this;
		}

		/** Setting Employee departmentId by Builder */
		public EmployeeRegistrationBuilder departmentId(Integer departmentId) {
			this.departmentId = departmentId;
			return this;
		}

		/** Setting Employee password by Builder */
		public EmployeeRegistrationBuilder password(String password) {
			this.password = password;
			return this;
		}

		/** Build method */
		public EmployeeRegistrationModel build() {
			return new EmployeeRegistrationModel(this);
		}

	}

}
