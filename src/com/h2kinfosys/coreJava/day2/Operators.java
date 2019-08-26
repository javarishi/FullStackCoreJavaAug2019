package com.h2kinfosys.coreJava.day2;

public class Operators {

	public static void main(String[] args) {
		int variableOne = 100;
		int variableTwo = 200;
		System.out.println("Addition :: " + (variableOne + variableTwo));
		System.out.println("Addition :: " + (variableOne - variableTwo));
		System.out.println("Addition :: " + (variableOne * variableTwo));
		System.out.println("Addition :: " + (variableOne / variableTwo));
		System.out.println("Addition :: " + (variableOne % variableTwo));
		
		// Comparison < > <= >= != == instanceof
		boolean result = variableTwo > variableOne;
		System.out.println("Greater Than :: " + (variableOne > variableTwo));
		System.out.println("Greater Than or equals :: " + (variableOne >= variableTwo));
		System.out.println("Less Than :: " + (variableOne < variableTwo));
		System.out.println("Less Than or equals :: " + (variableOne <= variableTwo));
		System.out.println("Not equals :: " + (variableOne != variableTwo));
		System.out.println("equals :: " + (variableOne == variableTwo));

		// Logical operators - AND OR NOT && || !
		/* AND - &&
		 * S1 	&& 	S2		R
		 * T		T		T
		 * T		F		F
		 * F		T		F
		 * F		F		F
		 * 
		 * OR - ||
		 * 
		 * S1	|| 	S2		R
		 * T		T		T
		 * T		F		T
		 * F		T		T
		 * F		F		F		
		 * 
		 */
		boolean one = true;
		boolean two = false;
		
		System.out.println("one && two " + (one && two));
		System.out.println("one || two " + (one || two));
		System.out.println(" NOT One" + !one);
		System.out.println(" NOT Two" + !two);
		
	}

}
