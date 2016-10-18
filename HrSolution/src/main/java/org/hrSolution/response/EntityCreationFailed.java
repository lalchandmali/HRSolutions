package org.hrSolution.response;

import org.hrSolution.response.model.ResponseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * EntityCreationFailed is used for returning response as Entity was not created
 * 
 * @return Error
 * @return BAD request
 * */

/**
 * @author Lalchand Mali
 *
 */
public class EntityCreationFailed {

	private static final Logger logger = LoggerFactory
			.getLogger(EntityCreationFailed.class);

	public static ResponseEntity<Object> entityCreationFailed(Object data) {
		Status status = Status.ERROR;
		HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
		ResponseModel responseModel = new ResponseModel.ResponseBuilder(status,
				httpStatus).data(data).build();

		logger.debug("Entity was not created");
		return CustomResponse.customResponse(responseModel);
	}
}
