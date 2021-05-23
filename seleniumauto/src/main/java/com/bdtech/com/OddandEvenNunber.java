package com.bdtech.com;

public class OddandEvenNunber {

	public static void main(String[] args) {

		int[] a = {1,3,4,5,6,8,7,9};
		
		

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0)

				System.out.println("odd nunber::::::" + a[i]);
		}
		
		  System.out.println("+++++++++++++++++++++++++++++++++++"); 
		  for (int i = 0; i
		  < a.length; i++) { 
			  if (a[i] % 2 == 0)
		  
		  System.out.println("even Number::::" + a[i]); }
		 
		
	
		int []x= {1,2,3,4,5,6};
		for(int j=0;j<x.length;j++)
		{
			if(x[j]%2==0) {
				System.out.println("evern number"+ x[j]);
			}
		}
			for(int j=0;j<x.length;j++) {
				if(x[j]%2!=0) {
					System.out.println("oddd number "+x[j]);
				}
			}
		}

	}


