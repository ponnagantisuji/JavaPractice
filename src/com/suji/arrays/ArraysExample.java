package com.suji.arrays;

import com.suji.util.MyUtils;

public class ArraysExample {

	public static void main(String[] args) {
		int[] marks = new int[6];
		String[] names = {"Sudha","sujana","krishna"};
		for(int k=0;k<names.length;k++) {
		System.out.println("name"+" "+(k+1)+" " +names[k]);
		
		}
		for (int i = 0; i < 6; i++) {
			marks[i] = MyUtils.readInteger("marks");
		}
		System.out.println("percentage of the student is: " + getPercentage(marks));

	}

	private static float getPercentage(int[] marks) {

		int sum = 0;
		for (int j = 0; j < marks.length; j++) {
			sum = sum + marks[j];
		}
		return sum / marks.length;
	}
}
