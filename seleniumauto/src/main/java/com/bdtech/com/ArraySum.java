package com.bdtech.com;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int ave;
		
//1 approch
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int sum = Arrays.stream(a).sum();
		System.out.println(sum);
	
		//2nd approch
		
		int numbers[] = { 1, 2, 3, 4, 5, 6 };
		int sum1 = 0;
		for( int i : numbers) {
		    sum1 += i;
		}

		System.out.println(sum1);
		
	}

}
