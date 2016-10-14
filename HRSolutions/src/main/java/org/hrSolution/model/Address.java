package org.hrSolution.model;

/**
 * This model class is used for setting and getting parameters for Address
 * 
 * @author Vamsi Ram Obillaneni
 * 
 */

public class Address {

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

	/**
	 * Gets the {@link String} instance representing
	 * {@link Address#buildingNumber}
	 * 
	 * @return The {@link String} instance representing
	 *         {@link Address#buildingNumber}
	 */
	public String getBuildingNumber() {
		return buildingNumber;
	}

	/**
	 * Sets the {@link String} instance representing
	 * {@link Address#buildingNumber}
	 * 
	 * @Param The {@link String} instance representing
	 *        {@link Address#buildingNumber}
	 */
	public void setHouseNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	/**
	 * Gets the {@link String} instance representing
	 * {@link Address#streetAddress}
	 * 
	 * @return The {@link String} instance representing
	 *         {@link Address#streetAddress}
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * Sets the {@link String} instance representing
	 * {@link Address#streetAddress}
	 * 
	 * @Param The {@link String} instance representing
	 *        {@link Address#streetAddress}
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * Gets the {@link String} instance representing {@link Address#city}
	 * 
	 * @return The {@link String} instance representing {@link Address#city}
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the {@link String} instance representing {@link Address#city}
	 * 
	 * @Param The {@link String} instance representing {@link Address#city}
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the {@link String} instance representing {@link Address#state}
	 * 
	 * @return The {@link String} instance representing {@link Address#state}
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the {@link String} instance representing {@link Address#state}
	 * 
	 * @Param The {@link String} instance representing {@link Address#state}
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Gets the {@link String} instance representing {@link Address#zipcode}
	 * 
	 * @return The {@link String} instance representing {@link Address#zipcode}
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * Sets the {@link String} instance representing {@link Address#zipcode}
	 * 
	 * @Param The {@link String} instance representing {@link Address#zipcode}
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
