package com.learning.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Junit5TestLifeCycleTest {
	
	@BeforeAll
	public static void setup() {
		System.out.println("@BeforeAll is Executed.");
		
	}
	
	@BeforeEach
	public void setupThis() {
		System.out.println("@BeforeEach is executed.");
	}
	
	@Test
	public void test1() {
		System.out.println("Test-1 is executed.");
	}
	
	@Test
	public void test2() {
		System.out.println("Test-2 is executed.");
	}
	
	@AfterEach
	public void tearDownThis() {
		System.out.println("@AfterEach is executed.");
	}
	
	@AfterAll
	public static void tearDown() {
		System.out.println("@AfterAll is executed.");
	}

}
