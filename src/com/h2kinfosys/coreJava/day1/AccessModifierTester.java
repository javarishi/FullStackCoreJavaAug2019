package com.h2kinfosys.coreJava.day1;

public class AccessModifierTester {

	public static void main(String[] args) {
		HelloStudent hello = new HelloStudent();
	//	System.out.println("hello :: "  + hello.privateVariable);
		System.out.println("hello :: "  + hello.protectedVariable);
		System.out.println("hello :: "  + hello.defaultVariable);
		System.out.println("hello :: "  + hello.publicVariable);

	}

}
