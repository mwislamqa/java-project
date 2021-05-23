package com.bdtech.com;

public class CountLetter {
	
	
   
        public static void countLetter(String s){
                if(s==null){
                      return;
                }
                int counter=0;
                for(int i=0;i<s.length();i++){
                       if(Character.isLetter(s.charAt(i))){
                              counter++;
                      }
                }
                System.out.println(counter);
        }

        public static void main(String[] args) {
                CountLetter.countLetter("gggggg");
       }
}



