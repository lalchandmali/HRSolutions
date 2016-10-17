package org.hrSolution.response.model;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.hrSolution.response.Status;
import org.springframework.http.HttpStatus;

public class ResponseModel {
	private static final Logger logger = LogManager.getLogger(ResponseModel.class);

	@JsonIgnore
	private final HttpStatus httpStatus;
	private final Status status;
	private final String message;
	private final Object data;

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public Status getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public Object getData() {
		return data;
	}

	private ResponseModel(ResponseBuilder builder) {
		this.status = builder.status;
		this.httpStatus = builder.httpStatus;
		this.message = builder.message;
		this.data = builder.data;
	}

	public static class ResponseBuilder {
		private final Status status;
		private final HttpStatus httpStatus;
		private String message;
		private Object data;

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

		public ResponseModel build() {
			return new ResponseModel(this);
		}
	}
}
