package com.bdtech.com;

import java.lang.reflect.Method;

public class PrivateTestMethod {

	public static void main(String[] args) throws Exception {
		PivateMethod pm = new PivateMethod();
		Method method = PivateMethod.class.getDeclaredMethod("chase");
		method.setAccessible(true);

		method.invoke(pm);

	}

}
