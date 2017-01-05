package org.hrSolution.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@Table(name="user")
public class UserLoginModel {

	@Id
	@JsonProperty("uid")
	private int userId;

	@JsonProperty("pass")
	private String password;

	public UserLoginModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserLoginModel(UserLoginBuilder userLoginBuilder) {
		this.userId = userLoginBuilder.userId;
		this.password = userLoginBuilder.password;
	}

	public int getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}

	public static class UserLoginBuilder {

		@JsonProperty("uid")
		private int userId;

		@JsonProperty("pass")
		private String password;

		public UserLoginBuilder userId(int userId) {
			this.userId = userId;
			return this;
		}

		public UserLoginBuilder password(String password) {
			this.password = password;
			return this;
		}

		public UserLoginModel build() {
			return new UserLoginModel(this);

		}
	}

}
