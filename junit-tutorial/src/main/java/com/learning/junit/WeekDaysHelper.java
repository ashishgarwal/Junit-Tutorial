package com.learning.junit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class WeekDaysHelper {

	public static final Map<Integer, String> WEEKDAYS_MAP = new HashMap<>();

	static {
		WEEKDAYS_MAP.put(1, "Sunday");
		WEEKDAYS_MAP.put(2, "Monday");
		WEEKDAYS_MAP.put(3, "Tuesday");
		WEEKDAYS_MAP.put(4, "Wednesday");
		WEEKDAYS_MAP.put(5, "Thursday");
		WEEKDAYS_MAP.put(6, "Friday");
		WEEKDAYS_MAP.put(7, "Saturday");
	}
	
	public static Collection<String> getWeekDays() {
		return WEEKDAYS_MAP.values();
	}
	
	/**
	 * Returns the name of week day for the given dayId.
	 * 
	 * @param dayId
	 * @return
	 */
	public String getDay(final Integer dayId) {
		if (dayId == null) {
			throw new IllegalArgumentException("Id cannot be null");
		}
		String day = WEEKDAYS_MAP.get(dayId);
		if (StringUtils.isBlank(day)) {
			throw new RuntimeException("Day is not found for the id:" + dayId);
		}
		return day;
	}

}
