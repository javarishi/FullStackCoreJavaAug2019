package com.h2kinfosys.coreJava.day2;

public class OperatorsExample {

	
	public static void main(String[] args) {
		// Check a condition
		int age = 18;
	//	boolean check = age > 21;
	//	System.out.println(check);
		String state = "FL";
		
		if (age < 21) {
			if(state.equals("FL")) {
				System.out.println("Please proceed for checkout");
			}else {
				System.out.println("Not allowed to take alcohol");
			}
		}else {
			System.out.println("Please proceed for checkout");
		}
		
		/**
		 * if condition 
		 * 		block - if condition is true
		 * else
		 * 		block - if condition is false
		 */
		
		/**
		 * Take day of week - select different time 
		 * Sysout - Batch starting time
		 */
	}
}
