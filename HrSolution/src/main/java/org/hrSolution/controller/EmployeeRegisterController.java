package org.hrSolution.controller;

import org.hrSolution.model.EmployeeRegistrationModel;
import org.hrSolution.response.EntityCreatedResponse;
import org.hrSolution.response.EntityCreationFailed;
import org.hrSolution.service.EmployeeRegisterService;
import org.hrSolution.status.constant.StatusCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeRegisterController {
	private static final Logger logger = LoggerFactory
			.getLogger(EmployeeRegisterController.class);

	@Autowired
	EmployeeRegisterService employeeRegisterService;

	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = "/register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> employeeRegister(
			@RequestBody EmployeeRegistrationModel employeeRegistrationModel) {

		/**
		 * ResponseEntity object for returning response back to client
		 */
		ResponseEntity<Object> response;

		/**
		 * message is used for resource is created or not
		 */
		String message;
		/**
		 * Passing employeeRegistrationModel to EmployeeRegisterService class to
		 * process
		 */

		/**
		 * register method will return either true or false If employee
		 * registered successfully then it will return true otherwise it will
		 * return false
		 **/
		Boolean status = employeeRegisterService
				.register(employeeRegistrationModel);

		/**
		 * creating ResponseEntity class object for returning
		 */
		if (status) {
			message = StatusCode.RESOURCE_CREATED;
			response = EntityCreatedResponse
					.entityCreatedResponseBuilder(message);
		} else {
			message = StatusCode.RESOURCE_NOT_CREATED;
			response = EntityCreationFailed.entityCreationFailed(message);

		}

		return response;

	}
}