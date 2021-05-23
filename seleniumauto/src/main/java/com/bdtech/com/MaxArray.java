package com.bdtech.com;

import java.util.Arrays;
import java.util.Collections;

public class MaxArray {

	public static void main(String[] args) {

		Integer arr[] = { 10, 324, 45, 90, 9808 };
		
		int min =Collections.min(Arrays.asList(arr));
		System.out.println("collections use min  "+min);

		int max =Collections.max(Arrays.asList(arr));
		System.out.println("collections use max   "+max);

		int i;
		int j;

		// Initialize maximum element
		int max1 = arr[0];
		int min1 =arr[0];

		// Traverse array elements from second and
		// compare every element with current max
		for (i = 0; i < arr.length; i++) {
			if (arr[i] > max1) {
				max1 = arr[i];}
			}
		System.out.println(max);
		
		for (j=5;j<arr.length;j++) {
			if(arr[j]>min1) {
				min1=arr[0];
			}
		}
		System.out.println(min1);
	}
}