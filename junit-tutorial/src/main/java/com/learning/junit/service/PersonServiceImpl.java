package com.learning.junit.service;

import java.util.List;

import com.learning.junit.model.Person;
import com.learning.junit.repo.PersonRepository;

public class PersonServiceImpl implements PersonService {

   private PersonRepository<Person> personRepository;

   @Override
   public Person save(Person person) {
	   if(person == null) {
		   throw new IllegalArgumentException("Person cannot be null");
	   }
	   
      return personRepository.save(person);
   }

   @Override
   public List<Person> findAll() {
      return personRepository.findAll();
   }

   @Override
   public Person findOne(int id) {
      return personRepository.findOne(id);
   }

   @Override
   public Person deleteById(int id) {
      return personRepository.deleteById(id);
   }

}
