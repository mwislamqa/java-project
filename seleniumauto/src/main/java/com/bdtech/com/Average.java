package com.bdtech.com;

public class Average {
	public static void main(String[] args) {

		int[] a = { 2, 4, 5, 6, 8 };

		double ave;
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += sum + i;

		}
		System.out.println(sum);
		ave = (double)sum / a.length;
		System.out.println("ave value=" + ave);

	}

}
