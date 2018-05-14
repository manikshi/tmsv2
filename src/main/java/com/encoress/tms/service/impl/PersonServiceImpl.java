package com.encoress.tms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encoress.tms.domain.entity.Person;
import com.encoress.tms.repository.PersonRepository;
import com.encoress.tms.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository repository;

	@Override
	public List<Person> getAllPersons() {
		return repository.findAll();
	}

	@Override
	public void addPerson(Person person) {
		repository.insert(person);
	}

	@Override
	public void removePersonById(Long id) {
		repository.softDeleteById(id);
	}

	@Override
	public Person getPersonById(Long id) {
		return repository.findById(id);
	}

}
