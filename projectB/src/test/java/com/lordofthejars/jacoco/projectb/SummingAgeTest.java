package com.lordofthejars.jacoco.projectb;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SummingAgeTest {

	@Test
	public void should_sum_age_of_father_and_son() {
		int fatherAge = 33;
		int sonAge = 1;

		AgeCalculator ageCalculator = new AgeCalculator();

		int totalAge = ageCalculator.sum(fatherAge, sonAge);
		assertThat(totalAge, is(34));

	}
	
	@Test(expected=IllegalArgumentException.class)
	public void should_sum_age_of_father_and_son_cannot_be_negative() {
		int fatherAge = 33;
		int sonAge = -1;

		AgeCalculator ageCalculator = new AgeCalculator();

		ageCalculator.sum(fatherAge, sonAge);

	}

}
