package org.hrSolution.response;

import org.hrSolution.response.model.ResponseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class EntityCreationFailed {

	private static final Logger logger = LoggerFactory.getLogger(EntityCreationFailed.class);

	public static ResponseEntity<Object> entityCreationFailed(Object data) {
		Status status = Status.ERROR;
		HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
		ResponseModel responseModel = new ResponseModel.ResponseBuilder(status, httpStatus).data(data).build();

		return CustomResponse.customResponse(responseModel);
	}
}
