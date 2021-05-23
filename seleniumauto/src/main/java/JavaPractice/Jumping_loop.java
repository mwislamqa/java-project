package JavaPractice;

public class Jumping_loop {

	public static void main(String[] args) {
		
		int a=10;
		a=20;// if you define same variable 2nd time 1st value gone count 2nd value
		System.out.println(a);
		
		System.out.println("---------------------------break5");
		for (int i=0; i<10;i++) {
			if(i==5) {//it printing before 5 then exit from loop
				break;
			}
			
			System.out.println(i);
		}
		System.out.println("---------------------------skip5");
		for(int i=0;i<10; i++) {
			if(i==5) {
				continue;//it skiping num 5 
			}
			System.out.println(i);
		}
		System.out.println("-------------------------skip5210");
		for(int i=0;i<10; i++) {
			if(i==5|| i==2||i==10) {// using or(||)operator
				continue;//it skiping num 5 2 10
			}
			System.out.println(i);
	}
		System.out.println("------------------------call 5210");
		for(int i=0;i<10; i++) {
			if(i==5 && i==2 && i==10) {// using or(||)operator
				continue;//it skiping num 5 2 10
			}
			System.out.println("&&"+i);
	}
}
}