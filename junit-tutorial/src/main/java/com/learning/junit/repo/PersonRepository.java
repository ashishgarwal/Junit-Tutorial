package com.learning.junit.repo;

import java.util.List;

import com.learning.junit.model.Person;

public interface PersonRepository<T extends Person> {
   List<Person> findAll();

   Person save(Person user);

   Person findOne(int id);

   Person deleteById(int id);

}
