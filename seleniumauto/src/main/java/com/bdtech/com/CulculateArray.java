package com.bdtech.com;

public class CulculateArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6 };
		int sum = 0;
		float div = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			

		}

		System.out.println("sum value:::::" + sum);
		div=sum/a.length;
		System.out.println(div);
	}

}
