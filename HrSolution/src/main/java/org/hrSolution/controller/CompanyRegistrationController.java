package org.hrSolution.controller;

import org.hrSolution.model.CompanyAddress;
import org.hrSolution.model.CompanyRegistrationModel;
import org.hrSolution.response.EntityCreatedResponse;
import org.hrSolution.response.EntityCreationFailed;
import org.hrSolution.service.CompanyRegistrationService;
import org.hrSolution.status.constant.StatusCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CompanyRegistrationController {

	private static final Logger logger = LoggerFactory.getLogger(CompanyRegistrationController.class);

	@Autowired
	CompanyRegistrationService companyRegistrationService;

	@RequestMapping(value = {
			"/company/register" }, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)

	public ResponseEntity<Object> companyRegistration(@RequestBody CompanyRegistrationModel companyRegistrationModel) {

		/**
		 * ResponseEntity object for returning response back to client
		 */
		ResponseEntity<Object> response;

		/**
		 * message is used for resource is created or not
		 */
		String message;

		CompanyAddress companyAddress = companyRegistrationModel.getCompanyAddress();
		/**
		 * Passing companyRegistrationModel to CompanyRegisterService class to
		 * process
		 */

		/**
		 * register method will return either true or false If company
		 * registered successfully then it will return true otherwise it will
		 * return false
		 **/

		Boolean status = companyRegistrationService.registerCompany(companyRegistrationModel, companyAddress);

		/**
		 * creating ResponseEntity class object for returning
		 */
		if (status) {
			message = StatusCode.RESOURCE_CREATED;
			response = EntityCreatedResponse.entityCreatedResponseBuilder(message);
		} else {
			message = StatusCode.RESOURCE_NOT_CREATED;
			response = EntityCreationFailed.entityCreationFailed(message);

		}

		return response;

	}
}
