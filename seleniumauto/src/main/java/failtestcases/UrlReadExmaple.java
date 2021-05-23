package failtestcases;

import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class UrlReadExmaple {

	    //read web pages in HTML format
	    public static void main(String[] args) {
	        try {
	            URL mySite = new URL("https://www.google.com/");
	            URLConnection yc = mySite.openConnection();
	           Scanner in = new Scanner(new InputStreamReader(yc.getInputStream()));
	           // Scanner in = new Scanner(System.in);
	            int count = 0;
	            while (in.hasNext()) {
	                System.out.println(in.next());
	                count++;
	            }
	            System.out.println("Number of tokens: " + count);
	            in.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

	
	
	
	
	
	
	


