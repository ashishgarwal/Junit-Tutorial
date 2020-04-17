package com.learning.junit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
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
		targetTestObject.getDay(4);
	}

	@Test
	public void getDayTest() {
		Assertions.assertEquals("Wednesday", targetTestObject.getDay(4));
	}
	
	
}
