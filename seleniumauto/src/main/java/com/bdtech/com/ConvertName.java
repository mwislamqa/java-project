package com.bdtech.com;

public class ConvertName {

	static String name = "Grace Hopper";

	public static String convertName(String name) {
		String firstName = name.substring(0, name.indexOf(" "));

		String lastName = name.substring(name.indexOf(" ") + 1); // + 1 to skip the space

		String cName = lastName + " " + firstName; // Add a space
		return cName;
	}

	public static void main(String args[]) {

		String name1 = convertName(name); // Assign the returned value
		System.out.println(name1); // Print the returned value
	}

}
