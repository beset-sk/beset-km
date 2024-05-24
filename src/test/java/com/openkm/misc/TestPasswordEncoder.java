package com.openkm.misc;

import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class TestPasswordEncoder {

	private static String PWD = "admin";
//	private static String EncodedPWD = "b91cd1a54781790beaa2baf741fa6789";
	private static String EncodedPWD = "{4CkZQpDwWN6o5jaXylFaXT8D1f4sUi5Wb0QJ3YpBzWk=}2f0ce2db01eb75626d479013bf38b4ae";

	/* OpenKM.xml contains Bean password encoder so we need to check all passwords */
	/* see : https://stackoverflow.com/questions/45816441/password-change-in-spring-security-xml */
	public static void main(String[] args) {

		PasswordEncoder pwdEncoder = new MessageDigestPasswordEncoder("MD5");
		/* Compare defined Encoded PWD */
		System.out.println("--- Original ----");

		comparePasswords(pwdEncoder, PWD, EncodedPWD);

		System.out.println("--- Orig END ---");


		System.out.println("---- New ONE -----");
		String newEncodedPwd =  pwdEncoder.encode(PWD);
		comparePasswords(pwdEncoder, PWD, newEncodedPwd);
		System.out.println("New Encoded : " + newEncodedPwd);

	}

	private static void comparePasswords(PasswordEncoder encoder, String rawPwd, String encodedPwd) {
		if (encoder.matches(rawPwd, encodedPwd)) {
			System.out.println("Encoded Password is correct.");
		} else {
			System.err.println("Encoded Password is NOT CORRECT !!!");
		}
	}

}
