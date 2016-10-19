package org.hrSolution.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * This model class is used for setting and getting variable for Company
 * 
 * @author Vamsi Ram Obillaneni
 * 
 */
@Entity
@Table(name = "COMPANY")
public class CompanyRegistrationModel {

	/*
	 * We are following Builder Design Pattern to create the below Model Object
	 */


	/**
	 * The Id of the Company
	 */
	@Id
	@GenericGenerator(name="comp" , strategy="increment")
	@GeneratedValue(generator="comp")
	@JsonProperty("cId")
	private Long companyId;

	
	/**
	 * The Name of the Company
	 */
	@JsonProperty("cName")
	private String companyName;

	/**
	 * Description about the Company
	 */
	@JsonProperty("cDesc")
	private String companyDescription;

	/**
	 * The Contact Email of the Company
	 */
	@JsonProperty("cEMail")
	private String companyEmail;

	/**
	 * The Contact phone number of the Company
	 */
	@JsonProperty("cPhone")
	private String companyPhone;

	/**
	 * The Name of the Company CEO
	 */
	@JsonProperty("CEO")
	private String companyCEO;

	/**
	 * The address of the Company
	 */
	@JsonProperty("addr")
	@OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
	private CompanyAddress companyAddress;

	public CompanyRegistrationModel() {
		super();
	}
	/**
	 * Constructor
	 * 
	 * @Param The {@link CompanyRegistrationModelBuilder} instance representing
	 *        {@link CompanyRegistrationModelBuilder}
	 */
	public CompanyRegistrationModel(CompanyRegistrationModelBuilder companyRegistrationModelBuilder) {
		this.companyName = companyRegistrationModelBuilder.companyName;
		this.companyDescription = companyRegistrationModelBuilder.companyDescription;
		this.companyEmail = companyRegistrationModelBuilder.companyEmail;
		this.companyPhone = companyRegistrationModelBuilder.companyPhone;
		this.companyCEO = companyRegistrationModelBuilder.companyCEO;
	}

	/**
	 * Gets the {@link Long} instance representing
	 * {@link CompanyRegistrationModel#companyId}
	 * 
	 * @return The {@link Long} instance representing
	 *         {@link CompanyRegistrationModel#companyId}
	 */
	public Long getCompanyId() {
		return companyId;
	}
	
	/**
	 * Gets the {@link String} instance representing
	 * {@link CompanyRegistrationModel#companyName}
	 * 
	 * @return The {@link String} instance representing
	 *         {@link CompanyRegistrationModel#companyName}
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * Gets the {@link String} instance representing
	 * {@link CompanyRegistrationModel#companyDescription}
	 * 
	 * @return The {@link String} instance representing
	 *         {@link CompanyRegistrationModel#companyDescription}
	 */
	public String getCompanyDescription() {
		return companyDescription;
	}

	/**
	 * Gets the {@link String} instance representing
	 * {@link CompanyRegistrationModel#companyEmail}
	 * 
	 * @return The {@link String} instance representing
	 *         {@link CompanyRegistrationModel#companyEmail}
	 */
	public String getCompanyEmail() {
		return companyEmail;
	}

	/**
	 * Gets the {@link String} instance representing
	 * {@link CompanyRegistrationModel#companyPhone}
	 * 
	 * @return The {@link String} instance representing
	 *         {@link CompanyRegistrationModel#companyPhone}
	 */
	public String getCompanyPhone() {
		return companyPhone;
	}

	/**
	 * Gets the {@link String} instance representing
	 * {@link CompanyRegistrationModel#companyCEO}
	 * 
	 * @return The {@link String} instance representing
	 *         {@link CompanyRegistrationModel#companyCEO}
	 */
	public String getCompanyCEO() {
		return companyCEO;
	}

	/**
	 * Gets the {@link CompanyAddress} instance representing
	 * {@link CompanyRegistrationModel#companyAddress}
	 * 
	 * @return The {@link String} instance representing
	 *         {@link CompanyRegistrationModel#companyAddress}
	 */
	public CompanyAddress getCompanyAddress() {
		return companyAddress;
	}

	public static class CompanyRegistrationModelBuilder {

		/**
		 * The Id of the Company
		 */
		@JsonProperty("cId")
		private Long companyId;

		/**
		 * The Name of the Company
		 */
		@JsonProperty("cName")
		private String companyName;

		/**
		 * Description about the Company
		 */
		@JsonProperty("cDesc")
		private String companyDescription;

		/**
		 * The Contact Email of the Company
		 */
		@JsonProperty("cEMail")
		private String companyEmail;

		/**
		 * The Contact phone number of the Company
		 */
		@JsonProperty("cPhone")
		private String companyPhone;

		/**
		 * The Name of the Company CEO
		 */
		@JsonProperty("CEO")
		private String companyCEO;

		/**
		 * The address of the Company
		 */
		@JsonProperty("addr")
		private CompanyAddress companyAddress;

		/**
		 * Sets the {@link Long} instance representing
		 * {@link CompanyRegistrationModelBuilder#companyId}
		 * 
		 * @Param The {@link Long} instance representing
		 *        {@link CompanyRegistrationModelBuilder#companyId}
		 * @return The {@link CompanyRegistrationModelBuilder} instance
		 *         representing {@link CompanyRegistrationModelBuilder}
		 */
		public CompanyRegistrationModelBuilder setCompanyId(Long companyId) {
			this.companyId = companyId;
			return this;
		}
		
		/**
		 * Sets the {@link String} instance representing
		 * {@link CompanyRegistrationModelBuilder#companyName}
		 * 
		 * @Param The {@link String} instance representing
		 *        {@link CompanyRegistrationModelBuilder#companyName}
		 * @return The {@link CompanyRegistrationModelBuilder} instance
		 *         representing {@link CompanyRegistrationModelBuilder}
		 */
		public CompanyRegistrationModelBuilder setCompanyName(String companyName) {
			this.companyName = companyName;
			return this;
		}

		/**
		 * Sets the {@link String} instance representing
		 * {@link CompanyRegistrationModelBuilder#companyDescription}
		 * 
		 * @Param The {@link String} instance representing
		 *        {@link CompanyRegistrationModelBuilder#companyDescription}
		 * @return The {@link CompanyRegistrationModelBuilder} instance
		 *         representing {@link CompanyRegistrationModelBuilder}
		 */
		public CompanyRegistrationModelBuilder setCompanyDescription(String companyDescription) {
			this.companyDescription = companyDescription;
			return this;
		}

		/**
		 * Sets the {@link String} instance representing
		 * {@link CompanyRegistrationModelBuilder#companyEmail}
		 * 
		 * @Param The {@link String} instance representing
		 *        {@link CompanyRegistrationModelBuilder#companyEmail}
		 * @return The {@link CompanyRegistrationModelBuilder} instance
		 *         representing {@link CompanyRegistrationModelBuilder}
		 */
		public CompanyRegistrationModelBuilder setCompanyEmail(String companyEmail) {
			this.companyEmail = companyEmail;
			return this;
		}

		/**
		 * Sets the {@link String} instance representing
		 * {@link CompanyRegistrationModelBuilder#companyPhone}
		 * 
		 * @Param The {@link String} instance representing
		 *        {@link CompanyRegistrationModelBuilder#companyPhone}
		 * @return The {@link CompanyRegistrationModelBuilder} instance
		 *         representing {@link CompanyRegistrationModelBuilder}
		 */
		public CompanyRegistrationModelBuilder setCompanyPhone(String companyPhone) {
			this.companyPhone = companyPhone;
			return this;
		}

		/**
		 * Sets the {@link String} instance representing
		 * {@link CompanyRegistrationModelBuilder#companyCEO}
		 * 
		 * @Param The {@link String} instance representing
		 *        {@link CompanyRegistrationModelBuilder#companyCEO}
		 * @return The {@link CompanyRegistrationModelBuilder} instance
		 *         representing {@link CompanyRegistrationModelBuilder}
		 */
		public CompanyRegistrationModelBuilder setCompanyCEO(String companyCEO) {
			this.companyCEO = companyCEO;
			return this;
		}

		/**
		 * Sets the {@link CompanyAddress} instance representing
		 * {@link CompanyRegistrationModelBuilder#companyAddress}
		 * 
		 * @Param The {@link String} instance representing
		 *        {@link CompanyRegistrationModelBuilder#companyAddress}
		 * @return The {@link CompanyRegistrationModelBuilder} instance
		 *         representing {@link CompanyRegistrationModelBuilder}
		 */
		public CompanyRegistrationModelBuilder setCompanyAddress(CompanyAddress companyAddress) {
			this.companyAddress = companyAddress;
			return this;
		}

		/**
		 * Gets the {@link CompanyRegistrationModel} instance representing
		 * {@link CompanyRegistrationModel}
		 * 
		 * @return The {@link CompanyRegistrationModel} instance representing
		 *         {@link CompanyRegistrationModel}
		 */
		public CompanyRegistrationModel build() {
			return new CompanyRegistrationModel(this);
		}

	}

}