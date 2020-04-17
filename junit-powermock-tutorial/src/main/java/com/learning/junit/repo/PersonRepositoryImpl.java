package com.learning.junit.repo;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.learning.junit.model.Person;

public final class PersonRepositoryImpl implements PersonRepository<Person> {

	private static List<Person> personList = Arrays.asList(new Person(101, "Mohan", new Date()),
			new Person(102, "Sameer", new Date()), new Person(103, "Ajay", new Date()),
			new Person(104, "Rajesh", new Date()));

	public List<Person> findAll() {
		return personList;
	}

	public Person save(Person person) {
		if (person.getId() == null) {
			person.setId(personList.size() + 1);
		}
		personList.add(person);
		return person;
	}

	public Person findOne(int id) {
		for (Person person : personList) {
			if (person.getId() == id) {
				return person;
			}
		}
		return null;
	}

	public Person deleteById(int id) {
		Iterator<Person> iterator = personList.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			if (person.getId() == id) {
				iterator.remove();
				return person;
			}
		}
		return null;
	}

}
