package com.suji.maths;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int n = sc.nextInt();
		
		if (n >= 10) {
			System.out.println("error");
		} else {
			Factorial f = new Factorial();
			f.printFactorial(n);
			// 3!= 3*2*1=6
			// 4!=4*3*2*1=24
			printTable(n);
		}
	}
	
	void printFactorial(int n) {
		int j = 1;
		for(int i=1;i<=n;i++)
			
		{
			j=i*j;
		}
		System.out.println("Factorial of "+ n  + " is :"+j);
	}

	private static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + n + " = " + (i * n));
		}
	}
}