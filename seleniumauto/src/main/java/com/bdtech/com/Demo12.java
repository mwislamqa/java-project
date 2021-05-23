package com.bdtech.com;

public class Demo12 {

	public static void main(String[] args) {
		int num=545;
		int revrse=0;
		while(num !=0) {
			revrse=revrse*10+num%10;
			num=num/10;
			//System.out.println(revrse);
		}
		System.out.println(revrse);
	}

}
