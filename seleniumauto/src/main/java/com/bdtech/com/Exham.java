package com.bdtech.com;

import java.util.Arrays;
import java.util.Collections;

public class Exham {

	public static void main(String[] args) {
		Integer []pp= {1,3,4,45,5,5};
		int min=Collections.min(Arrays.asList(pp));
		int max=Collections.max(Arrays.asList(pp));
		
		int num=121;
		int revrse=0;
		while(num !=0) {
			revrse=revrse*10+num%10;
			num=num/10;
			System.out.println(revrse);
		}
		System.out.println(revrse);
		
		String ss="i love selenium";
		String []sst=ss.split(" ");
		for(String sq:sst) {
			
			System.out.println(sq);
		}

// even number if int a=1 then print odd
		int a = 2;
		while (a <= 10) {
			System.out.println("even print" + a);
			a += 2;

		}
		// printing 1-10
		System.out.println("-------------------------------");
		for (a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		// decending 10 to 1
		System.out.println("-----------------------------");
		for (a = 10; a > 0; a--) {
			System.out.println(a);
		}
		// print 2 and 7 only
		System.out.println("-------------------------");
		for (a = 1; a <= 10; a++) {

			if (a == 2 || a == 7) {
				System.out.println(a);
			}

		}
		// skip 2 and 7
		System.out.println("-------------------------");
		for (a = 1; a <= 10; a++) {

			if (a == 2 || a == 7) {
				continue;

			}
			System.out.println(a);
		}
		// print max and min by sort() method
		int x[] = { 1, 3, 4, 5, 8 };
		Arrays.sort(x);

		System.out.println("Mini" + x[0]);
		System.out.println("max" + x[x.length - 1]);
		
		System.out.println("----------------------------");
		// print max and min by for loop
		int y[] = { 1, 3, 4, 5, 8 };
		int max33 = y[0];
		/*
		 * for (int i = 0; i < y.length; i++) { // y[i]gater than max if (y[i] > max) {
		 * max = y[i]; } }
		 */
		System.out.println(max);
		System.out.println("----------------------------------");
		// reverse interger
		int k = 12345;
		int rev = 0;
		while (k != 0) {
			rev = rev * 10 + k % 10;
			k = k / 10;

		}
		System.out.println("reverse number" + rev);
		System.out.println("------------------------------------");
		// even from arry
		int a1[] = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] % 2 == 0) {
				System.out.println(a1[i]);
			}

		}
		System.out.println("------------------------------------");
		// odd from array
		for (int j = 0; j < a1.length; j++) {
			if (a1[j] % 2 != 0) {
				System.out.println(a1[j]);
			}
			System.out.println("------------------------------------");
			//print match number
			int p[]= {1,2,3,4,5,6,7};
			int w[]= {1,10,3,4,5,6,8};
			for(int q=0;q<p.length;q++) {
				
				for(int t=0;t<w.length;t++) {
					if(p[q]==w[t]) {
						System.out.println(p[q]=w[t]);
					}
					
				}
				
			}
		
		}

	}
}
