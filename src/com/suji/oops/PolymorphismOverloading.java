package com.suji.oops;

/*
 * Method Overloading is also called as compile time polymorphism
 */
public class PolymorphismOverloading {
	public void print() {
		System.out.println("Printing");
	}

	public static String print(String name, int number) {
	//	System.out.println("name is :" + name + " and number is:" + number + "and she is software Engineer" + "\n she stays in MO");
	// + is used for adding two strings
    // \n is used for writing nest line  
		return "name is :" + name + " and number is:" + number   +  "and she is software Enginner" + "\n she stays in MO";
	}
	public static int print( int number1,int number2) {
		return number1+number2;
	}
	public static void print( int number1) {
	}

	public void print(String name) {
		// print is the method name
		// name is input argument
		// name is of string type
		// void is the return type

		System.out.println("Printing Name:" + name);
	}

	public static void main(String[] args) {
		PolymorphismOverloading p = new PolymorphismOverloading();
		p.print();
		p.print("krishna");
		print("suji", 5);
		System.out.println("output is "  +  print("suji", 5));
		// up line tells method calling
		System.out.println("Sum of two numbers:"+print(3,4));
	}

}
