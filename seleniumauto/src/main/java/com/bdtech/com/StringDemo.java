package com.bdtech.com;

public class StringDemo {

	public static void main(String[] args) {
		
		String a="hcl";
	final	String b="hcl";
	//concatination 
	a=a.concat(b);
	System.out.println(a);
	
	
		System.out.println("2"+2+3);
		//pring 223
		
		System.out.println(2+3+"4");
		
		//pring 54
		
		
		//Write a program to swap two String variables without using the third variable.
		//convert value x to y
		String x="javax";
		String y="javay";
		x=x+y;
		y.substring(0,(x.length()-y.length()));
		x=x.substring(y.length(),(x.length()));
		System.out.println("x=::::"+x +"y=:::"+y);
		
		
		//Write a program to replace particular character with another
        //character  from the given string without using Java API's.
		String s="micro software";
		String s1[]=s.split(" ");
		String ch=" ";
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equals("wicro")) {
				ch=ch+"mcro";
			}
			else {
				ch=ch+s1[i];
			}
			
		}
		System.out.println(ch);
		//if u need change any letter/word
		String p="software";
		System.out.println(p.replace('f', 't'));
		String k="md islam";
		System.out.println(k.replace("md","mohd"));

	}

}
