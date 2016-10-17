package org.hrSolution.response;

import org.hrSolution.response.model.ResponseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class EntityCreatedResponse {

	private static final Logger logger = LoggerFactory.getLogger(EntityCreatedResponse.class);

	public static ResponseEntity<Object> entityCreatedResponseBuilder(Object data) {

		Status status = Status.SUCCESS;
		HttpStatus httpStatus = HttpStatus.OK;
		ResponseModel responseModel = new ResponseModel.ResponseBuilder(status, httpStatus).data(data).build();
		return CustomResponse.customResponse(responseModel);
	}

}
