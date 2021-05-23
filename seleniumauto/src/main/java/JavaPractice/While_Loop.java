package JavaPractice;

public class While_Loop {

	public static void main(String[] args) {
		 int i=1;
		while(i<=10) {//printing 1-10
			 System.out.println(i);
			  i+=1; // i++;
		 } 
		 //printing even number
		
		  i=2; 
		  while(i<=10) { 
			  System.out.println("print even"+i);
		  
		  i+=2; //i= i+2; }
		  }
		  
		  
		  i=1;
		 while(i<=10) {
			 System.out.println("print odd "+i);
			i+=2;// i=i+2;
		 }
		 //decending value
		 i=10;
		 while(i>=1) {//(i>0)
			 System.out.println(i);
			 i--;
		 }
		 // note:when we do while and when for loop? when limit we know 1<10 then we can use both but
		 // when we dont know limit we cant use for loop 
		 //while(isnext){}
	
	}
}
