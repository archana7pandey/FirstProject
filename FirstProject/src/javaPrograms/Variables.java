package javaPrograms;

public class Variables {

	public static void main(String[] args) {
		
		// Variables are temporary memory locations which stores data
		// Variable declarations

		int i;
		char c;
		String s;
		float f;
		boolean b;
		double d;

		// Values Assignment to the variables
		i = 10;
		c = 'X';
		s = "Welcome to the Programing";
		f = 100.45f;
		b = true;
		d = 200.5467545;

		/*
		 * Assigning of different value to the boolean variable b="hello"; b=1;
		 * It will give error for type mismatch
		 */

		// printing values of the variables
		System.out.println("My integer variable's value is: " + i);
		System.out.println("My char variable's value is: " + c);
		System.out.println("My string variable's value is: " + s);
		System.out.println("My float variable's value is: " + f);
		System.out.println("My boolean variable's value is: " + b);
		System.out.println("My double variable's value is: " + d);

	}

}
