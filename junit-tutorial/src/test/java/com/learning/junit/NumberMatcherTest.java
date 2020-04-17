package com.learning.junit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

import org.junit.jupiter.api.Test;

public class NumberMatcherTest {

	@Test
	public void greaterThanTest() {
		System.out.println(WeekDaysHelper.getWeekDays());
		assertThat(1, greaterThan(0));
		
		
	}
	
	@Test
	public void lessThanTest() {
		assertThat(7, lessThan(8));
	}
	
}
