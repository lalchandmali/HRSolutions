package org.hrSolution.controller;

import org.hrSolution.model.HrSolutionsDocToFillModel;
import org.hrSolution.response.EntityCreatedResponse;
import org.hrSolution.response.EntityCreationFailed;
import org.hrSolution.service.WordTemplateService;
import org.hrSolution.status.constant.StatusCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * @author Lalchand Mali	
 * 
 * */
@Controller
public class WordTemplateController {
	private static final Logger logger = LoggerFactory
			.getLogger(WordTemplateController.class);

	@Autowired
	WordTemplateService WordTemplateService;
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = "/docToFill", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> docFill(
			@RequestBody HrSolutionsDocToFillModel hrSolutionsDocToFillModel) {
		/**
		 * ResponseEntity object for returning response back to client
		 */
		ResponseEntity<Object> response;

		/**
		 * message is used for resource is created or not
		 */
		String message;
		boolean status = WordTemplateService
				.employeeDocFill(hrSolutionsDocToFillModel);
		/**
		 * creating ResponseEntity class object for returning
		 */
		if (status) {
			message = StatusCode.DOCUMENT_GENERATED;
			response = EntityCreatedResponse
					.entityCreatedResponseBuilder(message);
		} else {
			message = StatusCode.DOCUMENT_NOT_GENERATED;
			response = EntityCreationFailed.entityCreationFailed(message);

		}

		return response;
	}
}
