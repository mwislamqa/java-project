package com.bdtech.com;

public class Change_Latter_string {

	public static void main(String[] args) {
		String a = "Software";
		String[] a1 = a.split("");
		String ch = "";
		for (int i = 0; i < a1.length; i++) {
			if (a1[i].equals("f")) {
				ch = ch + "m";
			} else {
				ch = ch + a1[i];
			}
		}
		System.out.println(ch);
		// shotcute way
		System.out.println(a.replace('w', 'z'));
		String s="hellow world";
		System.out.println(s.replace("hellow", "hi"));
	}

}
