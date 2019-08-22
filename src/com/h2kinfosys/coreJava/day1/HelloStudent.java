package com.h2kinfosys.coreJava.day1;
// Creating Project
// github repository
// Package
// creating a class
// Variables - 8 premitive and String
// Static and Instance variables
// Access Modifiers
// Creating Objects - accessing variables with Objects
public class HelloStudent{
	// variables - data carriers
	// Data types - 8 types 
	// numeric data
	byte byteData = 99;
	short shortData = 9999;
	int intData = 999999999;
	long longData = 99999999999999l;
	// decimal data
	float floatData = 999.999f;
	double doubleData = 9999.9999;
	// character data
	char charData = 'A'; // single quotes and single chara
	// boolean 
	boolean boolData = false;
	
	// Non Premitive - 
	String strData = "Hello Students";
	
	// Class Level Data 
	static String companyName = "H2KInfosys Inc.";
	/*
	 * Access Modifier
	 * public - accessible to anyone
	 * private - no one expect that class has access to it
	 * protected - Class and its children can access to it 
	 * default - package access - all the classes within same package have access to it
	 */
	
	// methods - data processors
	
	public static void main(String args[]) {
		// Object of class = instance of class 
		// ClassName userDefineObjectName = new ClassName(); 
		HelloStudent hello = new HelloStudent(); // hello is Object of class HelloStudent
		HelloStudent helloWorld = new HelloStudent(); // helloWorld is Object of class HelloStudent
		helloWorld.strData = "Hello World";
		HelloStudent.companyName = "Best Buy Inc"; // static data will be accessed with ClassName
		System.out.println("helloWorld :: "  + helloWorld.strData);
		System.out.println("hello :: "  + hello.strData);
		System.out.println("helloWorld :: "  + helloWorld.companyName);
		System.out.println("hello :: "  + hello.companyName);
	}
}






