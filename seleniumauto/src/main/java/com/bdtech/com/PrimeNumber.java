package com.bdtech.com;

public class PrimeNumber {

	public static void main(String[] args) {
		// program to check prime number using a for loop

		int num = 20;

		int j = 2;
		// for whiel loop
		boolean flag = false;

		while (j <= num / 2) { // loop runs until i<=num/2.on each iteration, whether
			// num is divisble by i is checked and // the value of i is incremented by 1

			if (num % j == 0) {
				flag = true;
				//break;
			}
			++j;
		}

		/*
		 * for (int i = 2; i <= num / 2; i++) {
		 * 
		 * if (num % i == 0) { flag = false; break; }
		 */

		if (!flag) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}
}
