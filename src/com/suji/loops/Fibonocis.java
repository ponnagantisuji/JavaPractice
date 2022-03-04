package com.suji.loops;

import java.util.Scanner;

public class Fibonocis {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		int k, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		k = sc.nextInt();
		System.out.println("Fibonocis is ");
		System.out.println(i + " " + "\n" + j + " ");
		for (int m = 3; m <= k; m++) {
			n = i + j;
			System.out.println(+n);
			i = j;
			j = n;
		}

	}

}
