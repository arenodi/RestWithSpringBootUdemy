package com.arenodi.spring.course.services;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.arenodi.spring.course.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	
	public Person findById(String id) {
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Andre");
		person.setLastName("Alves");
		person.setAddress("Curitiba  - Parana - Brasil");
		person.setGender("Male");
		return person;
		
	}

}
