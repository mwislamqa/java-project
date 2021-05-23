package JavaPractice;

public class Basic_java {
	
	
	public static void main(String[] args) {
		//operator in java
		//arithmetic ----> + -/ * %
		//relational operator (comparision)---> == < > <= => !=
		//logical opertor-----> && || !
		//incremental/decremental operator-----> ++ --
		//assigment operator------> =
		 int a=10;
		 int b=20;
		 
			//arithmetic ----> + -/ * %
		 System.out.println("sum a and b ::"+(a+b));
		 System.out.println("sub b and a ::"+(b-a));
		 System.out.println("div a and b ::"+(a/b));
		 System.out.println("moudulus div a and b ::"+(a%b));
		 System.out.println("multi a and b ::"+(a*b));
		
		
		//relational operator (comparision)---> == < > <= => !=
		 // always return boolean value
		 System.out.println(a==b);// false
		 System.out.println(a<b);// true
		 System.out.println(a>b);//false
		 System.out.println(a<=b);//true bcoz <= compare tow value less than and equal 
		                           //if any one ture given ture else false
		 System.out.println(a>=b);//false
		 System.out.println(a !=b);//ture
		 
		//logical opertor-----> && || !
		 boolean x= true;
		 boolean y= false;
		 System.out.println(x && y);//false bcox tow condition is not ture
		 System.out.println(x || y);//true bcoz one condition is ture
		 System.out.println(!x);// ! not ture but x ture given false
		 System.out.println(!y);// y not ture result given true
		 
		//incremental/decremental operator-----> ++ --
		 a=20;
		 a++;      //a=a+1;
		 System.out.println(a);
		 b=20;
		 b--;     //b=b-1
		 System.out.println(b);
		 

	}


}
