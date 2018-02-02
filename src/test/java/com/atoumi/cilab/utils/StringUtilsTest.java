package com.atoumi.cilab.utils;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testIsNumberWithString() {
		// Given
		String notNumber = "ahmed";

		// When
		boolean result = StringUtils.isNumber(notNumber);
		
		//Then
		Assertions.assertThat(result).isFalse();
	}

}
