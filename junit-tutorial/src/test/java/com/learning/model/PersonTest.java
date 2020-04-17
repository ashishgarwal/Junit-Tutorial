package com.learning.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.beans.HasProperty.hasProperty;
import static org.hamcrest.object.HasToString.hasToString;
import static org.hamcrest.beans.SamePropertyValuesAs.samePropertyValuesAs;


import org.junit.jupiter.api.Test;

import com.learning.junit.model.Person2;

public class PersonTest {
	
	Person2 person = new Person2("Mike", "Washington");
	
	@Test
	public void personObjectToStringTest() {
		String personString = person.toString();
		assertThat(person, hasToString(personString));

	}
	
	@Test
	public void personHAsFirstNamePropertyTest() {
//		assertThat(person, hasProperty("name"));
		assertThat(person, hasProperty("firstName"));
	}
	
	@Test
	public void twoPersonHasSameValuesTest() {
		Person2 person1 = new Person2("John", "Disilva");
//		Person2 person2 = new Person2("John", "Robinet");
		Person2 person2 = new Person2("John", "Disilva");
		assertThat(person1, samePropertyValuesAs(person2));
	}

}
