package org.hrSolution.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/** This model class is used for setting and getting variable for
 * preEmployment means Employee has not joined the company
 * */
/**
 * @author lalchand mali
 *
 */
public class PreEmployeeRegistrationModel {
	/**
	 * class attributes declaration
	 */
	/**
	 * PreEmployee Company Name
	 * */
	@JsonProperty("cmpName")
	private String preCompanyName;
	/**
	 * preEmployee name variable declaration
	 */
	@JsonProperty("pname")
	private String preEmpName;

	/**
	 * preEmployee Mail variable declaration
	 */
	@JsonProperty("pmail")
	private String preEmpMail;

	/**
	 * preEmployee Phone variable declaration
	 */
	@JsonProperty("pphone")
	private String preEmpPhone;

	/**
	 * preEmployee Password variable declaration
	 */
	@JsonProperty("ppass")
	private String preEmpPassword;

	/** Parameterized constructor for setting attributes values */
	public PreEmployeeRegistrationModel(
			PreEmployeeRegistrationBuilder preEmployeeRegistrationBuilder) {
		this.preEmpName = preEmployeeRegistrationBuilder.preEmpName;
		this.preEmpMail = preEmployeeRegistrationBuilder.preEmpMail;
		this.preEmpPhone = preEmployeeRegistrationBuilder.preEmpPhone;
		this.preEmpPassword = preEmployeeRegistrationBuilder.preEmpPassword;
	}

	public String getPreCompanyName() {
		return preCompanyName;
	}

	/** Getting Employee name */
	public String getPreEmpName() {
		return preEmpName;
	}

	/** Getting Employee mail */
	public String getPreEmpMail() {
		return preEmpMail;
	}

	/** Getting Employee Phone number */
	public String getPreEmpPhone() {
		return preEmpPhone;
	}

	/** Getting Employee Password */
	public String getPreEmpPassword() {
		return preEmpPassword;
	}

	/* EmployeeRegistrationBuilder class for building the result */
	public static class PreEmployeeRegistrationBuilder {
		/**
		 * class attributes declaration
		 */
		/**
		 * PreEmployee Company Name
		 * */
		@JsonProperty("cmpName")
		private String preCompanyName;
		/**
		 * preEmployee name variable declaration
		 */
		@JsonProperty("pname")
		private String preEmpName;

		/**
		 * preEmployee Mail variable declaration
		 */
		@JsonProperty("pmail")
		private String preEmpMail;

		/**
		 * preEmployee Phone variable declaration
		 */
		@JsonProperty("pphone")
		private String preEmpPhone;

		/**
		 * preEmployee Password variable declaration
		 */
		@JsonProperty("ppass")
		private String preEmpPassword;

		/** Setting Employee name by Builder */
		public PreEmployeeRegistrationBuilder preEmpName(String preEmpName) {
			this.preEmpName = preEmpName;
			return this;
		}

		/** Setting Employee mail by Builder */
		public PreEmployeeRegistrationBuilder preEmpMail(String preEmpMail) {
			this.preEmpMail = preEmpMail;
			return this;
		}

		/** Setting Employee Phone by Builder */
		public PreEmployeeRegistrationBuilder preEmpPhone(String preEmpPhone) {
			this.preEmpPhone = preEmpPhone;
			return this;
		}

		/** Setting Employee password by Builder */
		public PreEmployeeRegistrationBuilder preEmpPassword(
				String preEmpPassword) {
			this.preEmpPassword = preEmpPassword;
			return this;
		}

		/** Setting Employee password by Builder */
		public PreEmployeeRegistrationBuilder preCompanyName(
				String preCompanyName) {
			this.preCompanyName = preCompanyName;
			return this;
		}

		/** Build method */
		public PreEmployeeRegistrationModel build() {
			return new PreEmployeeRegistrationModel(this);
		}

	}

}
