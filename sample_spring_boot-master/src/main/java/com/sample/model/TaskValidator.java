package com.sample.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;



public class TaskValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Task.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		Task task = (Task) target;
		if (task.title.isEmpty()) {
			errors.rejectValue("title", "Please enter title");
		}
		if (task.description.isEmpty()) {
			errors.rejectValue("description", "Please enter description");
		}
		if (task.scheduled_date.isEmpty()) {
			errors.rejectValue("scheduledate", "Please enter schedule date");
		}
		if (task.complete_date.isEmpty()) {
			errors.rejectValue("completedate", "Please enter complete date");
		}
		
		
	}

	
	

}
