package com.lordofthejars.jacoco.projecta;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class SummingTwoNumbersTest {

	@Test
	public void should_return_calculated_result() {
		assertThat(MathOperations.add(1, 1), is(2));
	}
	
}
