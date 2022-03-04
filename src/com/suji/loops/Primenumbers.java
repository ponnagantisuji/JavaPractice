package com.suji.loops;

import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {
		Scanner ob1 = new Scanner(System.in);
		System.out.println("enter a number ");
		int num = ob1.nextInt();
		System.out.println("num" + isItPrimenumber(num));
		
		for(int i=1;i<100;i++) {
			System.out.println(isItPrimenumber(i));
		}

	}

	private static String isItPrimenumber(int num) {
		if(num == 0 || num == 1 )
		return num+ "is not prime number";
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)return num+"is not prime number";
			
		}
		return num+"is prime number";
		}
}

