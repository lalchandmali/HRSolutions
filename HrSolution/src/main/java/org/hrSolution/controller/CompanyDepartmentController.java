
package org.hrSolution.controller;

import org.hrSolution.model.CompanyDepartmentModel;
import org.hrSolution.response.EntityCreatedResponse;
import org.hrSolution.response.EntityCreationFailed;
import org.hrSolution.service.CompanyDepartmentService;
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

@Controller
public class CompanyDepartmentController {

	private static final Logger logger = LoggerFactory.getLogger(CompanyDepartmentController.class);

	@Autowired
	CompanyDepartmentService compDeptService;
	
	@Autowired
    MessageSource messageSource;
	
	@RequestMapping(value = { "/department" } , produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> addDepartment(@RequestBody CompanyDepartmentModel compDeptModel) {

		/**
		 * ResponseEntity object for returning response back to client
		 */
		ResponseEntity<Object> response;

		/**
		 * message is used for resource is created or not
		 */
		String message;
		/**
		 * Passing companyDepartmentModel to CompanyDepartmentService class to
		 * process
		 */

		/**
		 * addDepartment method will return either true or false If comapny
		 * added department successfully then it will return true otherwise it will
		 * return false
		 **/
		Boolean status = compDeptService.addDepartment(compDeptModel);

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
