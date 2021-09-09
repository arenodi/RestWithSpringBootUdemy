package com.arenodi.spring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arenodi.spring.course.model.Person;
import com.arenodi.spring.course.services.PersonServices;

@RestController
@RequestMapping(value="/person")
public class PersonController {
	
	@Autowired
	private PersonServices services;
	
	@RequestMapping(value="/{id}",
			method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)	
	public Person findById(@PathVariable(name = "id") String id) {
		return services.findById(id);
	}
}