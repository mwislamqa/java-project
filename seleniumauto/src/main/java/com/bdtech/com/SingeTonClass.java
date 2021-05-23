package com.bdtech.com;

public class SingeTonClass {
	//singleton is concept of java singleton design pattern.
	//if we create one instrance obj thats means class is singleton
	// we have to create static instance (obj)
	// we have to difine constructor private. we cant create obj like Abc obj= new Abc();is not allow
	// we have to create a static method which is return Abc instance getInstace and return obj
	// why we make static method bcoz obj instace is static 

	public static void main(String[] args) {

		Abc obj1 = Abc.getInstance();
		Abc obj12 = Abc.getInstance();
	}
}

class Abc {
	static Abc obj = new Abc();// make instance static

	private Abc() {
		System.out.println("singleton");
	}

	public static Abc getInstance() {
		return obj;

	}
}
