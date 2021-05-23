package com.bdtech.com;

import org.testng.asserts.SoftAssert;

public class Assertion {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		SoftAssert at = new SoftAssert();
		at.assertTrue(a > b);
		at.assertTrue(true, "result should me true");

		//System.out.println();

	}

}
