package com.jersey.service;

import com.jersey.model.Person;
import com.jersey.model.Response;

public interface PersonService {
	public Response addPerson(Person p);
	public Response deletePerson(int id);
	public Person getPerson(int id);
	public Person[] getAllPersons();

}
