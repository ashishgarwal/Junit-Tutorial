package com.learning.junit;

import static com.learning.junit.matchers.WeekDaysMatcher.IsAWeekDay;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class WeekDaysHelperTest {

	private WeekDaysHelper targetTestObject = new WeekDaysHelper();

	@Test
	public void getDayWhenDayIdIsNullTest() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			targetTestObject.getDay(null);
		});

	}

	@Test
	public void getDayWhenDayIdIsInvalidTest() {
		Assertions.assertThrows(RuntimeException.class, () -> {
			targetTestObject.getDay(16);
		});
	}

	@Test
	public void getDayReturnsNotNullTest() {
		Assertions.assertNotNull(targetTestObject.getDay(4));
	}

	@Test
	public void getDayTest() {
		Assertions.assertEquals("Wednesday", targetTestObject.getDay(4));
	}
	
	@Test
	public void isAWeekDayTest() {
		assertThat("Monday", IsAWeekDay());
	}
	
	
}
