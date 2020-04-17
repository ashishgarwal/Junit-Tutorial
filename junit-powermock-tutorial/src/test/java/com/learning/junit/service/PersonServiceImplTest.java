package com.learning.junit.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import com.learning.junit.model.Person;
import com.learning.junit.repo.PersonRepositoryImpl;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ PersonRepositoryImpl.class, Person.class })
public class PersonServiceImplTest {

	private PersonService personService = new PersonServiceImpl();

	private PersonRepositoryImpl mockPersonRepository;

	@Captor
	private ArgumentCaptor<Person> personCaptor;

	@Before
	public void initMocks() {
		mockPersonRepository = mock(PersonRepositoryImpl.class);
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
	
	@Test
	public void hasSupervisorTrueTest() {
		mockStatic(Person.class);
		when(Person.getSupervisorName()).thenReturn("test name");
		assertThat(personService.hasSupervisor(), equalTo(true));
		
	}
	
	@Test
	public void hasSupervisorFalseTest() {
		mockStatic(Person.class);
		when(Person.getSupervisorName()).thenReturn(null);
		assertThat(personService.hasSupervisor(), equalTo(false));
	}

}
