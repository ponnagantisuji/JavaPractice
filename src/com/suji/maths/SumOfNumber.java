package com.suji.maths;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int n = sc.nextInt();
		
		if (n >= 10) {
			System.out.println("error");
		} else {
			SumOfNumber s = new SumOfNumber();
			s.getSumOfNos(n);
			
			
			// 3!= 3*2*1=6
			// 4!=4*3*2*1=24
		
		}
	}

	void getSumOfNos(int n) {
		int j = 0;
		for(int i=0;i<=n;i++)
			
		{
			j=i+j;
		}
		System.out.println("sum of "+ n  + "is :"+j);
	}

	private static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + n + " = " + (i + n));
		}
	}

}


