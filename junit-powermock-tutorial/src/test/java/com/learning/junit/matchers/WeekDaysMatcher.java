package com.learning.junit.matchers;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

import com.learning.junit.WeekDaysHelper;

public class WeekDaysMatcher extends BaseMatcher<String> {

	@Override
	public boolean matches(Object item) {
		return WeekDaysHelper.getWeekDays().contains(item);
	}

	@Override
	public void describeTo(Description description) {
		description.appendText("not a weekday");
		
	}
	
	public static Matcher<String> IsAWeekDay() {
		return new WeekDaysMatcher();
	}

	
}
