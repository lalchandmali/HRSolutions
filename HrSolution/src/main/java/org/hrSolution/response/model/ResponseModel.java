package org.hrSolution.response.model;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.hrSolution.response.Status;
import org.springframework.http.HttpStatus;

/**
 * Response model is used for getter and setter attributes for custom Response
 * 
 * @attributes httpStatus e.g 200,201
 * @attributes status e.g Ok,Success,Error
 * @attributes message e.g custom message
 * 
 * */

/**
 * @author Lalchand Mali
 *
 */
public class ResponseModel {
	private static final Logger logger = LogManager
			.getLogger(ResponseModel.class);
	/**
	 * Response model attributes declaration
	 * */
	private final HttpStatus httpStatus;
	private final Status status;
	private final String message;
	private final Object data;

	/**
	 * Getting HttpStatus
	 * */

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	/**
	 * Getting Status
	 * */

	public Status getStatus() {
		return status;
	}

	/**
	 * Getting Message
	 * */

	public String getMessage() {
		return message;
	}

	/**
	 * Getting Data
	 * */

	public Object getData() {
		return data;
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param ResponseBuider
	 * */
	private ResponseModel(ResponseBuilder builder) {
		this.status = builder.status;
		this.httpStatus = builder.httpStatus;
		this.message = builder.message;
		this.data = builder.data;
	}

	/**
	 * ResponseBuilder is used for building response
	 * */
	public static class ResponseBuilder {

		/**
		 * ResponseBuilder attributes declaration
		 * */
		private final Status status;
		private final HttpStatus httpStatus;
		private String message;
		private Object data;

		/**
		 * Parameterized constructor
		 * */
		public ResponseBuilder(Status status, HttpStatus httpStatus) {
			this.status = status;
			this.httpStatus = httpStatus;
		}

		public ResponseBuilder message(String message) {
			this.message = message;
			return this;
		}

		public ResponseBuilder data(Object data) {
			this.data = data;
			return this;
		}

		/**
		 * Build method for building response
		 * */
		public ResponseModel build() {
			return new ResponseModel(this);
		}
	}
}
