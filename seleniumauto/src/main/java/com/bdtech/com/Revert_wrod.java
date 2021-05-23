package com.bdtech.com;

public class Revert_wrod {
	static String s = "md islam";

	public static void main(String[] args) {

		String rName = converName(s);
		System.out.println(rName);
		
		
// revert one word string
		StringBuffer sb = new StringBuffer("selenium");
		System.out.println(sb.reverse());
	}
// revart 1st name to last name
	static String converName(String name) {
		String fname = name.substring(0, name.indexOf(" "));
		String lname = name.substring(name.indexOf(" ") + 1);
		String cName = lname + " " + fname;
		return cName;

	}

}
