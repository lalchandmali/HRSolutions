package org.hrSolution.model;

import org.codehaus.jackson.annotate.JsonProperty;

/*This model class is used for setting and getting variable for
 * preEmployment
 * */
public class PreEmployeeRegistrationModel {
	/* class attributes declaration */
	@JsonProperty("ename")
	private String preEmpName;

	@JsonProperty("email")
	private String preEmpMail;

	@JsonProperty("ephone")
	private String preEmpPhone;

	@JsonProperty("epass")
	private String preEmpPassword;

	/* Parameterized constructor for setting attributes values */
	public PreEmployeeRegistrationModel(PreEmployeeRegistrationBuilder preEmployeeRegistrationBuilder) {
		this.preEmpName = preEmployeeRegistrationBuilder.preEmpName;
		this.preEmpMail = preEmployeeRegistrationBuilder.preEmpMail;
		this.preEmpPhone = preEmployeeRegistrationBuilder.preEmpPhone;
		this.preEmpPassword = preEmployeeRegistrationBuilder.preEmpPassword;
	}

	/* Getting Employee name */
	public String getPreEmpName() {
		return preEmpName;
	}

	/* Getting Employee mail */
	public String getPreEmpMail() {
		return preEmpMail;
	}

	/* Getting Employee Phone number */
	public String getPreEmpPhone() {
		return preEmpPhone;
	}

	/* Getting Employee Password */
	public String getPreEmpPassword() {
		return preEmpPassword;
	}

	/* EmployeeRegistrationBuilder class for building the result */
	public static class PreEmployeeRegistrationBuilder {
		/* class attributes declarations */
		@JsonProperty("ename")
		private String preEmpName;

		@JsonProperty("email")
		private String preEmpMail;

		@JsonProperty("ephone")
		private String preEmpPhone;

		@JsonProperty("epass")
		private String preEmpPassword;

		/* Setting Employee name by Builder */
		public PreEmployeeRegistrationBuilder preEmpName(String preEmpName) {
			this.preEmpName = preEmpName;
			return this;
		}

		/* Setting Employee mail by Builder */
		public PreEmployeeRegistrationBuilder preEmpMail(String preEmpMail) {
			this.preEmpMail = preEmpMail;
			return this;
		}

		/* Setting Employee Phone by Builder */
		public PreEmployeeRegistrationBuilder preEmpPhone(String preEmpPhone) {
			this.preEmpPhone = preEmpPhone;
			return this;
		}

		/* Setting Employee password by Builder */
		public PreEmployeeRegistrationBuilder preEmpPassword(String preEmpPassword) {
			this.preEmpPassword = preEmpPassword;
			return this;
		}

		/* Build method */
		public PreEmployeeRegistrationModel build() {
			return new PreEmployeeRegistrationModel(this);
		}

	}

}
