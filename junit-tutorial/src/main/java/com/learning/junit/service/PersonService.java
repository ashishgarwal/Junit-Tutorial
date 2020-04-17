package com.learning.junit.service;

import java.util.List;

import com.learning.junit.model.Person;

public interface PersonService {

   Person save(Person user);

   List<Person> findAll();

   Person findOne(int id);

   Person deleteById(int id);

}
