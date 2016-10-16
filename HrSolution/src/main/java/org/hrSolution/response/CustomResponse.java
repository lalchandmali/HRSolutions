package org.hrSolution.response;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonProcessingException;
import org.hrSolution.response.model.ResponseModel;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomResponse {

	private static final Logger logger = LogManager.getLogger(CustomResponse.class);

	public static ResponseEntity<Object> customResponse(ResponseModel responseModel) {
		ObjectMapper objectMapper = new ObjectMapper();
		String response = null;
		try {
			objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
			response = objectMapper.writeValueAsString(responseModel);
		} catch (JsonProcessingException jsonException) {
			logger.error("Error in processing Json", jsonException);
		} catch (Exception exception) {
			logger.error("Error occured ", exception);
		}
		return new ResponseEntity<Object>(response, responseModel.getHttpStatus());
	}
}
