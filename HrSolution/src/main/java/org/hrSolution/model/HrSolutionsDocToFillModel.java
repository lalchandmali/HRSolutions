package org.hrSolution.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HrSolutionsDocToFillModel {
	/**
	 * Pre employment form attributes
	 * */
	@JsonProperty("empDet")
	private EmployeeDetailModel empDetails;
	
	/**
	 * Pre Employee Applied Position
	 * */

	@JsonProperty("apos")
	private String appliedPosition;

	/**
	 * Pre Employee Intersted Position
	 * */

	@JsonProperty("ipos")
	private String interstedPosition;
	/**
	 * Pre Employee Gender
	 * */

	@JsonProperty("gen")
	private String preEmployeeGender;
	/**
	 * Pre Employee Date of Birth
	 * */

	@JsonProperty("dob")
	private String preEmployeeDateOfBirth;
	/**
	 * Pre Employee marital Status
	 * */

	@JsonProperty("pms")
	private String preEmployeeMaritalStatus;
	/**
	 * Pre Employee Nationality
	 * */

	@JsonProperty("pnat")
	private String preEmployeeNationality;
	/**
	 * Pre Employee country of Birth
	 * */

	@JsonProperty("pcob")
	private String preEmployeeCountryOfBirth;
	/**
	 * Pre Employee Health Status
	 * */

	@JsonProperty("phs")
	private String preEmployeeHealthStatus;
	/**
	 * Pre Employee Criminal Record
	 * */

	@JsonProperty("pcr")
	private String preEmployeeCriminalRecord;
	/**
	 * Pre Employee Passport number
	 * */

	@JsonProperty("ppn")
	private String preEmployeePassportNo;
	/**
	 * Pre Employee Emergency Contact Name
	 * */

	@JsonProperty("pecn")
	private String preEmployeeEmergencyContactName;
	/**
	 * Pre Employee Emergency Phone Number
	 * */

	@JsonProperty("pepn")
	private String preEmployeeEmergencyPhoneNumber;
	/**
	 * Pre Employee Emergency contact Relationship
	 * */

	@JsonProperty("pecr")
	private String preEmployeeEmergencyContactRelationship;
	/**
	 * Pre Employee Highest Education
	 * */

	@JsonProperty("phe")
	private String preEmployeeHighestEducation;
	/**
	 * Pre Employee university
	 * */

	@JsonProperty("pu")
	private String preEmployeeUniversity;
	/**
	 * Pre Employee Graduation year
	 * */

	@JsonProperty("pgy")
	private String preEmployeeGraduationYear;
	/**
	 * Pre Employee major eg. computer science engineering
	 * */

	@JsonProperty("pm")
	private String preEmployeeMajor;
	/**
	 * Pre Employee present address
	 * */

	@JsonProperty("ppa")
	private String preEmployeePresentAddress;
	/**
	 * Pre Employee Zip Code
	 * */

	@JsonProperty("pzc")
	private int preEmployeeZipCode;
	/**
	 * Pre Employee Base salary before tax
	 * */

	@JsonProperty("pbs")
	private double preEmployeeBaseSalary;
	/**
	 * Pre Employee Bonus before tax
	 * */

	@JsonProperty("pb")
	private double preEmployeeBonus;
	/**
	 * Pre Employee any stock option in current company
	 * */

	@JsonProperty("pso")
	private String preEmployeeStocksOrOption;
	/**
	 * Pre Employee Rewards
	 * */

	@JsonProperty("por")
	private String preEmployeeOtherRewards;
	/**
	 * Pre Employee Expected joining date
	 * */

	@JsonProperty("pej")
	private String preEmployeeExpectedJoining;
	/**
	 * Pre Employee any relatives working in this company
	 * */

	@JsonProperty("prwc")
	private Boolean preEmployeeRelativesWrkComp;
	/**
	 * Pre Employee relative name
	 * */

	@JsonProperty("prn")
	private String preEmployeeRelativeName;
	/**
	 * Pre Employee relative relationship
	 * */

	@JsonProperty("prr")
	private String preEmployeeRelativeRelationship;

	public HrSolutionsDocToFillModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HrSolutionsDocToFillModel(
			HrSolutionsDocToFillBuilder hrSolutionsDocToFillBuilder) {

		this.empDetails = hrSolutionsDocToFillBuilder.empDetails;
		this.appliedPosition = hrSolutionsDocToFillBuilder.appliedPosition;
		this.interstedPosition = hrSolutionsDocToFillBuilder.interstedPosition;
		this.preEmployeeGender = hrSolutionsDocToFillBuilder.preEmployeeGender;
		this.preEmployeeDateOfBirth = hrSolutionsDocToFillBuilder.preEmployeeDateOfBirth;
		this.preEmployeeMaritalStatus = hrSolutionsDocToFillBuilder.preEmployeeMaritalStatus;
		this.preEmployeeBaseSalary = hrSolutionsDocToFillBuilder.preEmployeeBaseSalary;
		this.preEmployeeBonus = hrSolutionsDocToFillBuilder.preEmployeeBonus;
		this.preEmployeeCountryOfBirth = hrSolutionsDocToFillBuilder.preEmployeeCountryOfBirth;
		this.preEmployeeCriminalRecord = hrSolutionsDocToFillBuilder.preEmployeeCriminalRecord;
		this.preEmployeeEmergencyContactName = hrSolutionsDocToFillBuilder.preEmployeeEmergencyContactName;
		this.preEmployeeEmergencyPhoneNumber = hrSolutionsDocToFillBuilder.preEmployeeEmergencyPhoneNumber;
		this.preEmployeeEmergencyContactRelationship = hrSolutionsDocToFillBuilder.preEmployeeEmergencyContactRelationship;
		this.preEmployeeExpectedJoining = hrSolutionsDocToFillBuilder.preEmployeeExpectedJoining;
		this.preEmployeeGraduationYear = hrSolutionsDocToFillBuilder.preEmployeeGraduationYear;
		this.preEmployeeHighestEducation = hrSolutionsDocToFillBuilder.preEmployeeHighestEducation;
		this.preEmployeeMajor = hrSolutionsDocToFillBuilder.preEmployeeMajor;
		this.preEmployeeUniversity = hrSolutionsDocToFillBuilder.preEmployeeUniversity;
		this.preEmployeeRelativesWrkComp = hrSolutionsDocToFillBuilder.preEmployeeRelativesWrkComp;
		this.preEmployeeRelativeName = hrSolutionsDocToFillBuilder.preEmployeeRelativeName;
		this.preEmployeeRelativeRelationship = hrSolutionsDocToFillBuilder.preEmployeeRelativeRelationship;
		this.preEmployeeNationality = hrSolutionsDocToFillBuilder.preEmployeeNationality;
		this.preEmployeePresentAddress = hrSolutionsDocToFillBuilder.preEmployeePresentAddress;
		this.preEmployeeZipCode = hrSolutionsDocToFillBuilder.preEmployeeZipCode;
		this.preEmployeePassportNo = hrSolutionsDocToFillBuilder.preEmployeePassportNo;
		this.preEmployeeStocksOrOption = hrSolutionsDocToFillBuilder.preEmployeeStocksOrOption;
		this.preEmployeeOtherRewards = hrSolutionsDocToFillBuilder.preEmployeeOtherRewards;
		this.preEmployeeHealthStatus = hrSolutionsDocToFillBuilder.preEmployeeHealthStatus;

	}

	public EmployeeDetailModel getEmpDetails() {
		return empDetails;
	}

	public String getAppliedPosition() {
		return appliedPosition;
	}

	public String getInterstedPosition() {
		return interstedPosition;
	}

	public String getPreEmployeeGender() {
		return preEmployeeGender;
	}

	public String getPreEmployeeDateOfBirth() {
		return preEmployeeDateOfBirth;
	}

	public String getPreEmployeeMaritalStatus() {
		return preEmployeeMaritalStatus;
	}

	public String getPreEmployeeNationality() {
		return preEmployeeNationality;
	}

	public String getPreEmployeeCountryOfBirth() {
		return preEmployeeCountryOfBirth;
	}

	public String getPreEmployeeHealthStatus() {
		return preEmployeeHealthStatus;
	}

	public String getPreEmployeeCriminalRecord() {
		return preEmployeeCriminalRecord;
	}

	public String getPreEmployeePassportNo() {
		return preEmployeePassportNo;
	}

	public String getPreEmployeeEmergencyContactName() {
		return preEmployeeEmergencyContactName;
	}

	public String getPreEmployeeEmergencyPhoneNumber() {
		return preEmployeeEmergencyPhoneNumber;
	}

	public String getPreEmployeeEmergencyContactRelationship() {
		return preEmployeeEmergencyContactRelationship;
	}

	public String getPreEmployeeHighestEducation() {
		return preEmployeeHighestEducation;
	}

	public String getPreEmployeeUniversity() {
		return preEmployeeUniversity;
	}

	public String getPreEmployeeGraduationYear() {
		return preEmployeeGraduationYear;
	}

	public String getPreEmployeeMajor() {
		return preEmployeeMajor;
	}

	public String getPreEmployeePresentAddress() {
		return preEmployeePresentAddress;
	}

	public int getPreEmployeeZipCode() {
		return preEmployeeZipCode;
	}

	public double getPreEmployeeBaseSalary() {
		return preEmployeeBaseSalary;
	}

	public double getPreEmployeeBonus() {
		return preEmployeeBonus;
	}

	public String getPreEmployeeStocksOrOption() {
		return preEmployeeStocksOrOption;
	}

	public String getPreEmployeeOtherRewards() {
		return preEmployeeOtherRewards;
	}

	public String getPreEmployeeExpectedJoining() {
		return preEmployeeExpectedJoining;
	}

	public Boolean getPreEmployeeRelativesWrkComp() {
		return preEmployeeRelativesWrkComp;
	}

	public String getPreEmployeeRelativeName() {
		return preEmployeeRelativeName;
	}

	public String getPreEmployeeRelativeRelationship() {
		return preEmployeeRelativeRelationship;
	}


	public static class HrSolutionsDocToFillBuilder {
		/**
		 * Pre employment form attributes
		 * */
		@JsonProperty("empDet")
		private EmployeeDetailModel empDetails;

		
		/**
		 * Pre Employee Applied Position
		 * */

		@JsonProperty("apos")
		private String appliedPosition;

		/**
		 * Pre Employee Intersted Position
		 * */

		@JsonProperty("ipos")
		private String interstedPosition;
		/**
		 * Pre Employee Gender
		 * */

		@JsonProperty("gen")
		private String preEmployeeGender;
		/**
		 * Pre Employee Date of Birth
		 * */

		@JsonProperty("dob")
		private String preEmployeeDateOfBirth;
		/**
		 * Pre Employee marital Status
		 * */

		@JsonProperty("pms")
		private String preEmployeeMaritalStatus;
		/**
		 * Pre Employee Nationality
		 * */

		@JsonProperty("pnat")
		private String preEmployeeNationality;
		/**
		 * Pre Employee country of Birth
		 * */

		@JsonProperty("pcob")
		private String preEmployeeCountryOfBirth;
		/**
		 * Pre Employee Health Status
		 * */

		@JsonProperty("phs")
		private String preEmployeeHealthStatus;
		/**
		 * Pre Employee Criminal Record
		 * */

		@JsonProperty("pcr")
		private String preEmployeeCriminalRecord;
		/**
		 * Pre Employee Passport number
		 * */

		@JsonProperty("ppn")
		private String preEmployeePassportNo;
		/**
		 * Pre Employee Emergency Contact Name
		 * */

		@JsonProperty("pecn")
		private String preEmployeeEmergencyContactName;
		/**
		 * Pre Employee Emergency Phone Number
		 * */

		@JsonProperty("pepn")
		private String preEmployeeEmergencyPhoneNumber;
		/**
		 * Pre Employee Emergency contact Relationship
		 * */

		@JsonProperty("pecr")
		private String preEmployeeEmergencyContactRelationship;
		/**
		 * Pre Employee Highest Education
		 * */

		@JsonProperty("phe")
		private String preEmployeeHighestEducation;
		/**
		 * Pre Employee university
		 * */

		@JsonProperty("pu")
		private String preEmployeeUniversity;
		/**
		 * Pre Employee Graduation year
		 * */

		@JsonProperty("pgy")
		private String preEmployeeGraduationYear;
		/**
		 * Pre Employee major eg. computer science engineering
		 * */

		@JsonProperty("pm")
		private String preEmployeeMajor;
		/**
		 * Pre Employee present address
		 * */

		@JsonProperty("ppa")
		private String preEmployeePresentAddress;
		/**
		 * Pre Employee Zip Code
		 * */

		@JsonProperty("pzc")
		private int preEmployeeZipCode;
		/**
		 * Pre Employee Base salary before tax
		 * */

		@JsonProperty("pbs")
		private double preEmployeeBaseSalary;
		/**
		 * Pre Employee Bonus before tax
		 * */

		@JsonProperty("pb")
		private double preEmployeeBonus;
		/**
		 * Pre Employee any stock option in current company
		 * */

		@JsonProperty("pso")
		private String preEmployeeStocksOrOption;
		/**
		 * Pre Employee Rewards
		 * */

		@JsonProperty("por")
		private String preEmployeeOtherRewards;
		/**
		 * Pre Employee Expected joining date
		 * */

		@JsonProperty("pej")
		private String preEmployeeExpectedJoining;
		/**
		 * Pre Employee any relatives working in this company
		 * */

		@JsonProperty("prwc")
		private Boolean preEmployeeRelativesWrkComp;
		/**
		 * Pre Employee relative name
		 * */

		@JsonProperty("prn")
		private String preEmployeeRelativeName;
		/**
		 * Pre Employee relative relationship
		 * */

		@JsonProperty("prr")
		private String preEmployeeRelativeRelationship;


		public HrSolutionsDocToFillBuilder appliedPosition(
				String appliedPosition) {
			this.appliedPosition = appliedPosition;
			return this;
		}

		public HrSolutionsDocToFillBuilder interstedPosition(
				String interstedPosition) {
			this.interstedPosition = interstedPosition;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeGender(
				String preEmployeeGender) {
			this.preEmployeeGender = preEmployeeGender;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeDateOfBirth(
				String preEmployeeDateOfBirth) {
			this.preEmployeeDateOfBirth = preEmployeeDateOfBirth;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeMaritalStatus(
				String preEmployeeMaritalStatus) {
			this.preEmployeeMaritalStatus = preEmployeeMaritalStatus;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeNationality(
				String preEmployeeNationality) {
			this.preEmployeeNationality = preEmployeeNationality;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeCountryOfBirth(
				String preEmployeeCountryOfBirth) {
			this.preEmployeeCountryOfBirth = preEmployeeCountryOfBirth;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeHealthStatus(
				String preEmployeeHealthStatus) {
			this.preEmployeeHealthStatus = preEmployeeHealthStatus;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeCriminalRecord(
				String preEmployeeCriminalRecord) {
			this.preEmployeeCriminalRecord = preEmployeeCriminalRecord;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeePassportNo(
				String preEmployeePassportNo) {
			this.preEmployeePassportNo = preEmployeePassportNo;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeEmergencyContactName(
				String preEmployeeEmergencyContactName) {
			this.preEmployeeEmergencyContactName = preEmployeeEmergencyContactName;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeEmergencyPhoneNumber(
				String preEmployeeEmergencyPhoneNumber) {
			this.preEmployeeEmergencyPhoneNumber = preEmployeeEmergencyPhoneNumber;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeEmergencyContactRelationship(
				String preEmployeeEmergencyContactRelationship) {
			this.preEmployeeEmergencyContactRelationship = preEmployeeEmergencyContactRelationship;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeHighestEducation(
				String preEmployeeHighestEducation) {
			this.preEmployeeHighestEducation = preEmployeeHighestEducation;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeUniversity(
				String preEmployeeUniversity) {
			this.preEmployeeUniversity = preEmployeeUniversity;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeGraduationYear(
				String preEmployeeGraduationYear) {
			this.preEmployeeGraduationYear = preEmployeeGraduationYear;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeMajor(
				String preEmployeeMajor) {
			this.preEmployeeMajor = preEmployeeMajor;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeePresentAddress(
				String preEmployeePresentAddress) {
			this.preEmployeePresentAddress = preEmployeePresentAddress;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeZipCode(
				int preEmployeeZipCode) {
			this.preEmployeeZipCode = preEmployeeZipCode;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeBaseSalary(
				double preEmployeeBaseSalary) {
			this.preEmployeeBaseSalary = preEmployeeBaseSalary;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeBonus(
				double preEmployeeBonus) {
			this.preEmployeeBonus = preEmployeeBonus;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeStocksOrOption(
				String preEmployeeStocksOrOption) {
			this.preEmployeeStocksOrOption = preEmployeeStocksOrOption;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeOtherRewards(
				String preEmployeeOtherRewards) {
			this.preEmployeeOtherRewards = preEmployeeOtherRewards;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeExpectedJoining(
				String preEmployeeExpectedJoining) {
			this.preEmployeeExpectedJoining = preEmployeeExpectedJoining;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeRelativesWrkComp(
				Boolean preEmployeeRelativesWrkComp) {
			this.preEmployeeRelativesWrkComp = preEmployeeRelativesWrkComp;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeRelativeName(
				String preEmployeeRelativeName) {
			this.preEmployeeRelativeName = preEmployeeRelativeName;
			return this;
		}

		public HrSolutionsDocToFillBuilder preEmployeeRelativeRelationship(
				String preEmployeeRelativeRelationship) {
			this.preEmployeeRelativeRelationship = preEmployeeRelativeRelationship;
			return this;
		}

		public HrSolutionsDocToFillBuilder empDetails(
				EmployeeDetailModel empDetails) {
			this.empDetails = empDetails;
			return this;
		}

		/** Build method */
		public HrSolutionsDocToFillModel build() {
			return new HrSolutionsDocToFillModel(this);
		}

	}

}
