package com.bdtech.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FielReadder {
//read note pad 
	public static void main(String[] args) throws IOException {
		FileReader fle = null;
		
			fle = new FileReader("C://Users//md islam//Documents//test.txt");
		

		BufferedReader bf = new BufferedReader(fle);
		//System.out.println(bf.readLine());// read note pad sentence
		
		//read length for seleinium.
		
		  String rd=bf.readLine();
		  System.out.println(rd);
		  String []sta=rd.split("selenium");
		  System.out.println(sta.length-1);
		 
		

	}

}
