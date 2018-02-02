package com.atoumi.cilab.utils;

import java.util.regex.Pattern;

/**
 * 
 * @author atoumi
 *
 */
public class StringUtils {

	public static final boolean isNumber(String text){
		String numberPattern = "[0-9]*";
		return Pattern.matches(numberPattern, text);
	}
}
