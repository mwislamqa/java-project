package com.bdtech.com;

public class Arraydemo {
	public static void main(String[] args) {

		int a[] = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

		for (int aa : a) {
			System.out.println(aa);
			
		if(aa==4) {
			continue;
		}
		
		}
		String s[]= {"honda","car","toyta","bmw"};
		for(int i=0;i<s.length;i++) {
			//System.out.println(s[i]);
			if(s[i].contains("hondaa")) {
			System.out.println("pass");
				
			}
			else {
				System.out.println("fail");
			}
			
			
		}
		System.out.println("looking car::"+s[0]);
	}
}
