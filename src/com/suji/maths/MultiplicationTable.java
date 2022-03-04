package com.suji.maths;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int n = sc.nextInt();
		if (n >= 10) {

			System.out.println("error");
		} else {
			// 1*3 = 3;
			//2*3 =6;
			for(int i=1 ; i<=10 ; i++)
			{
				
			System.out.println(i+ " * "+n+" = "+(i*n));
			}
		}
	}
}
