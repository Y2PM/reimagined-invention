package com.project;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class RandomNumberMavenTest {

	@Test
	public void test_generateMethod_ReturnsStringOfLength0_WhenGiven0ForLengthInputVar() {
		// Arrange
		RandomId randomId = new RandomId();
		String Id = "";
		// Act
		Id = randomId.generate(0);
		// Assert
		assertThat(Id.length(), is(0));
	}

	@Test
	public void test_generateMethod_ReturnsStringOfLength1_WhenGiven1ForLengthInputVar() {
		// Arrange
		RandomId randomId = new RandomId();
		String Id = "";
		// Act
		Id = randomId.generate(1);
		// Assert
		assertThat(Id.length(), is(1));
	}

	@Test
	public void test_generateMethod_ReturnsStringOfLength15_WhenGiven15ForLengthInputVar() {
		// Arrange
		RandomId randomId = new RandomId();
		String Id = "";
		// Act
		Id = randomId.generate(15);
		// Assert
		assertThat(Id.length(), is(15));
	}

	@Test
	public void test_generateMethod_Returns2DifferentStringsOfLength15_WhenGiven15ForLengthInputVarTwice() {
		// Arrange
		RandomId randomId = new RandomId();
		String Id1 = "";
		String Id2 = "";
		// Act
		Id1 = randomId.generate(15);
		Id2 = randomId.generate(15);
		// Assert
		assertThat(Id1, not(Id2));
	}

}
