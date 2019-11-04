package com.rebo.person.rest.controller;

import com.rebo.person.domain.Person;
import com.rebo.person.respository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("person")
public class PersonController {

	@Autowired
	PersonRepository personRepository;

	@GetMapping
	public String hello() {
		return "Hello00";
	}

	@GetMapping("/all")
	public List<Person> getAllPersons(){
		return personRepository.findAll();
	}

	@PostMapping("/save")
	public Person createPerson(@RequestBody Person person){
		return personRepository.save(person);
	}

	@PutMapping("/update")
	public Person updateAddress(@RequestBody Person person){
		Person person1=personRepository.findById(person.getId()).get();
		person1.setAddress(person.getAddress());
		return personRepository.save(person1);
	}


	@GetMapping("/{id}")
	public Optional<Person> getById(@PathVariable("id") long personId){
		return personRepository.findById(personId);
	}

	@GetMapping("/{firstname}/{lastname}")
	public Person getById(@PathVariable("lastname") String lastname,@PathVariable("lastname") String firstname){
		return personRepository.findByLastNameAndFirstName(lastname,firstname);
	}

}
