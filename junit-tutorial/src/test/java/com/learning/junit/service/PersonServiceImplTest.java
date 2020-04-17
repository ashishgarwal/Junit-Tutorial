package com.learning.junit.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.reflect.Whitebox;

import com.learning.junit.model.Person;
import com.learning.junit.repo.PersonRepositoryImpl;
public class PersonServiceImplTest {
	
	private PersonService personService = new PersonServiceImpl();
	
	@Mock
	private PersonRepositoryImpl mockPersonRepository;
	
	@Captor
	private ArgumentCaptor<Person> personCaptor;
	
	@BeforeEach
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
		Whitebox.setInternalState(personService, "personRepository", mockPersonRepository);
 
	}
	
	@Test
	public void saveWithTheGivenPersonTest() {
		
		Person person = new Person();
		personService.save(person);
		verify(mockPersonRepository).save(personCaptor.capture());
		assertThat(person, equalTo(personCaptor.getValue()));
		
	}
	
	@Test
	public void saveInvocationTest() {
		
		Person person = new Person();
		personService.save(person);
		verify(mockPersonRepository, times(1)).save(personCaptor.capture());
		assertThat(person, equalTo(personCaptor.getValue()));
		
	}
	
	@Test
	public void savePersonTest() {
		Person personFromRepo = new Person();
		when(mockPersonRepository.save(any(Person.class))).thenReturn(personFromRepo);
		assertThat(personService.save(new Person()), equalTo(personFromRepo));
		
		
	}
	
	

}
