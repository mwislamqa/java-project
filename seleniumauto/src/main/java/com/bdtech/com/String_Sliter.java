package com.bdtech.com;

public class String_Sliter {

	public static void main(String[] args) {
		
		String st= "i love my doughter";
		
		String word[]= st.split(" ");
		 for(String s:word)
		 {
			 System.out.println(s);
		 }
			
	}

}
