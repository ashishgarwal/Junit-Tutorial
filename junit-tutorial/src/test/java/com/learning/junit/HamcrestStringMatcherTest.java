package com.learning.junit;

import org.junit.jupiter.api.Test;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;
import static org.hamcrest.MatcherAssert.assertThat;

public class HamcrestStringMatcherTest {	
	
	@Test
	public void isStringEqualsWhenIgnoreCaseTest() {
		String a = "foo";
		String b = "FOO";
		assertThat(a, equalToIgnoringCase(b));
		
	}
	
	

}
