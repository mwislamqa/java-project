package com.bdtech.com;

public class Demo {

	public static void main(String[] args) {
		
		
		System.out.println(2+3+"4");//54
		System.out.println("2"+3+4);//234
		
        String s1 = null;
        String s2 = s1+"java";
        System.out.println(s2);//nulljava
        
       // String s3 = null;
       // System.out.println(s3.length());//java.lang.NullPointerException
        //System.out.println(null);//compile time error
       
        String a="var1";
        String b="var2";
        a= a+b;
        b = a.substring(0,(a.length()-b.length())); 
        a = a.substring(b.length(),(a.length()));
        //System.out.println("a = "+a+" b="+b);   //a=var2 b=var1
        System.out.println(a+" "+b);
        int x=10;
        int y=20;
        int c=0;
        
        
        



	}

}
