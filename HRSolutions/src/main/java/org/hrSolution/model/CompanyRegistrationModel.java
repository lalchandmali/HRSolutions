package org.hrSolution.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.hrSolution.model.PreEmployeeRegistrationModel.PreEmployeeRegistrationBuilder;

public class CompanyRegistrationModel {

	@JsonProperty("cName")
	private String companyName;
	@JsonProperty("cDesc")
	private String companyDescription;

	public CompanyRegistrationModel(CompanyRegistrationModelBuilder companyRegistrationModelBuilder) {
		this.companyName = companyRegistrationModelBuilder.companyName;
		this.companyDescription = companyRegistrationModelBuilder.companyDescription;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getCompanyDescription() {
		return companyDescription;
	}

	public static class CompanyRegistrationModelBuilder {

		@JsonProperty("cName")
		private String companyName;
		@JsonProperty("cDesc")
		private String companyDescription;

		public CompanyRegistrationModelBuilder setCompanyName(String companyName) {
			this.companyName = companyName;
			return this;
		}

		public CompanyRegistrationModelBuilder setCompanyDescription(String companyDescription) {
			this.companyDescription = companyDescription;
			return this;
		}

		public CompanyRegistrationModel build() {
			return new CompanyRegistrationModel(this);
		}

	}

}