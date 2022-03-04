package com.suji.maths;

import java.util.Scanner;

public class MathFunctions {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		a = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter b value:");
		b = sc1.nextInt();
		System.out.println("sum is:" + getSumValue(a, b));
		System.out.println("sub is:"+getSubValue(a,b));
		System.out.println("mul is:"+getMulValue(a,b));
		System.out.println("div is:"+getDivValue(a,b));
		System.out.println("percentage is:"+getReminderValue(a,b));

		



	}

	private static int getReminderValue(int a, int b) {
		return a%b;
	}

	private static int getDivValue(int a, int b) {
		return a/b;
	}

	private static int getMulValue(int a, int b) {
		
		return a*b;
	}

	private static int getSumValue(int a, int b) {
		return a + b;
	}

	private static int getSubValue(int a, int b) {
		return a - b;
	}

}
