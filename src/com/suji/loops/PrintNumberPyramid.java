package com.suji.loops;

public class PrintNumberPyramid {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			// System.out.print(i);
			for (int j = 1; j <= i; j++) {
				System.out.print(" " +(j+1));
				//System.out.println("#");
				//System.out.println(" "+j);
			}
			System.out.println(" ");

		}

	}

}
