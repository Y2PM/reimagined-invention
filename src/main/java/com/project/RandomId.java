package com.project;

import java.security.SecureRandom;

/**
 * 28Nov2018 This RandomId class contains a method to generate a pseudo random
 * String.
 * 
 * SPECIAL_CHARS Are selected from
 * https://www.owasp.org/index.php/Password_special_characters
 * 
 * @author joseph.bannert
 *
 */

public class RandomId {

	private static final String ALPHA_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
	private static final String NUMERIC = "0123456789";
	private static final String SPECIAL_CHARS = " !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
	private static final String Dictionary = ALPHA_CAPS + ALPHA + NUMERIC + SPECIAL_CHARS;
	SecureRandom rand = new SecureRandom();

	public String generate(int LengthInput) {
		String Id = "";
		for (int i = 0; i < LengthInput; i++) {
			int j = rand.nextInt(Dictionary.length());
			Id += Dictionary.charAt(j);
		}
		return Id;
	}

}
