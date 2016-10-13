package org.hrSolution.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class PreEmployeeRegistrationModel {

	@JsonProperty("ename")
	private String preEmpName;
	@JsonProperty("email")
	private String preEmpMail;
	@JsonProperty("ephone")
	private String preEmpPhone;
	@JsonProperty("epass")
	private String preEmpPassword;

	public PreEmployeeRegistrationModel(PreEmployeeRegistrationBuilder preEmployeeRegistrationBuilder) {
		this.preEmpName = preEmployeeRegistrationBuilder.preEmpName;
		this.preEmpMail = preEmployeeRegistrationBuilder.preEmpMail;
		this.preEmpPhone = preEmployeeRegistrationBuilder.preEmpPhone;
		this.preEmpPassword = preEmployeeRegistrationBuilder.preEmpPassword;
	}

	public String getPreEmpName() {
		return preEmpName;
	}

	public String getPreEmpMail() {
		return preEmpMail;
	}

	public String getPreEmpPhone() {
		return preEmpPhone;
	}

	public String getPreEmpPassword() {
		return preEmpPassword;
	}

	public static class PreEmployeeRegistrationBuilder {

		@JsonProperty("ename")
		private String preEmpName;
		@JsonProperty("email")
		private String preEmpMail;
		@JsonProperty("ephone")
		private String preEmpPhone;
		@JsonProperty("epass")
		private String preEmpPassword;

		public PreEmployeeRegistrationBuilder preEmpName(String preEmpName) {
			this.preEmpName = preEmpName;
			return this;
		}

		public PreEmployeeRegistrationBuilder preEmpMail(String preEmpMail) {
			this.preEmpMail = preEmpMail;
			return this;
		}

		public PreEmployeeRegistrationBuilder preEmpPhone(String preEmpPhone) {
			this.preEmpPhone = preEmpPhone;
			return this;
		}

		public PreEmployeeRegistrationBuilder preEmpPassword(String preEmpPassword) {
			this.preEmpPassword = preEmpPassword;
			return this;
		}

		public PreEmployeeRegistrationModel build() {
			return new PreEmployeeRegistrationModel(this);
		}

	}

}
