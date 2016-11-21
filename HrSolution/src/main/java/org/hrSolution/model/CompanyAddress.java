package org.hrSolution.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This model class is used for setting and getting parameters for Address
 * 
 * @author Vamsi Ram Obillaneni
 * 
 */
@Entity
@Table(name = "COMPANYADDRESS")
public class CompanyAddress {

	@Id
	@JsonProperty("cId")
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen", strategy = "foreign", parameters = @Parameter(name = "property", value = "companyRegistrationModel"))
	private Long companyId;

	/**
	 * The building Number of the Address
	 */
	private String buildingNumber;

	/**
	 * The street address of the Address
	 */
	private String streetAddress;

	/**
	 * The city information of the Address
	 */
	private String city;

	/**
	 * The state information of the Address
	 */
	private String state;

	/**
	 * The zipcode of the Address
	 */
	private String zipcode;

	@OneToOne(mappedBy = "companyAddress")
	private CompanyRegistrationModel companyRegistrationModel;

	public Long getCompanyId() {
		return companyId;
	}

	/**
	 * Gets the {@link String} instance representing
	 * {@link CompanyAddress#buildingNumber}
	 * 
	 * @return The {@link String} instance representing
	 *         {@link CompanyAddress#buildingNumber}
	 */
	public String getBuildingNumber() {
		return buildingNumber;
	}

	/**
	 * Sets the {@link String} instance representing
	 * {@link CompanyAddress#buildingNumber}
	 * 
	 * @Param The {@link String} instance representing
	 *        {@link CompanyAddress#buildingNumber}
	 */
	public void setHouseNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	/**
	 * Gets the {@link String} instance representing
	 * {@link CompanyAddress#streetAddress}
	 * 
	 * @return The {@link String} instance representing
	 *         {@link CompanyAddress#streetAddress}
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * Sets the {@link String} instance representing
	 * {@link CompanyAddress#streetAddress}
	 * 
	 * @Param The {@link String} instance representing
	 *        {@link CompanyAddress#streetAddress}
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * Gets the {@link String} instance representing {@link CompanyAddress#city}
	 * 
	 * @return The {@link String} instance representing
	 *         {@link CompanyAddress#city}
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the {@link String} instance representing {@link CompanyAddress#city}
	 * 
	 * @Param The {@link String} instance representing
	 *        {@link CompanyAddress#city}
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the {@link String} instance representing
	 * {@link CompanyAddress#state}
	 * 
	 * @return The {@link String} instance representing
	 *         {@link CompanyAddress#state}
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the {@link String} instance representing
	 * {@link CompanyAddress#state}
	 * 
	 * @Param The {@link String} instance representing
	 *        {@link CompanyAddress#state}
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Gets the {@link String} instance representing
	 * {@link CompanyAddress#zipcode}
	 * 
	 * @return The {@link String} instance representing
	 *         {@link CompanyAddress#zipcode}
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * Sets the {@link String} instance representing
	 * {@link CompanyAddress#zipcode}
	 * 
	 * @Param The {@link String} instance representing
	 *        {@link CompanyAddress#zipcode}
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * Gets the {@link CompanyRegistrationModel} instance representing
	 * {@link CompanyAddress#companyRegistrationModel}
	 * 
	 * @return The {@link CompanyRegistrationModel} instance representing
	 *         {@link CompanyAddress#companyRegistrationModel}
	 */
	public CompanyRegistrationModel getCompanyRegistrationModel() {
		return companyRegistrationModel;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public void setCompanyRegistrationModel(CompanyRegistrationModel companyRegistrationModel) {
		this.companyRegistrationModel = companyRegistrationModel;
	}

}
