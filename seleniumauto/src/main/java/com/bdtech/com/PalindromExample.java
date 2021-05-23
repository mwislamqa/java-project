package com.bdtech.com;

public class PalindromExample {

	public static void main(String[] args) {
		
		int n = 121; // user defined number to be checked for palindrome
		int rev=0;
		
		int temp;
		temp = n;

		// reversed integer is stored in variable
		while (temp != 0) {
			//int r = temp % 10;
			rev = rev * 10 + temp%10;
			temp = temp / 10;
		}
		//System.out.println(rev);
		// palindrome if orignalInteger(temp) and reversedInteger(rev) are equal
		if (n == rev)
			System.out.println(n + " is a palindrome.");
		else
			System.out.println(n + " is not a palindrome.");
	}
}
