package com.suji.arrays;

public class ArraysTest {

	public static void main(String[] args) {
		String[] names = new String[5];
		names[2] = "krishna";
		System.out.println("Name at third position : " + names[2]);
		names[4] = "venkat";
		System.out.println("name at 5th position is:" + names[4]);
        System.out.println("last name of the array is:" + names[4]);
        printLastelement(names);
        String [] depts = {"CSE","IT","ECE"};
        printLastelement(depts);
	}

	private static void printLastelement(String[] xyz) {
		int  n = xyz.length;
		 String l=xyz[xyz.length-1];
		System.out.println("last element is:" + l);
	}

}
// 
// size 10---last element index  9
//size 5-------li  4
//size 8-------li  7
//size 20 ----- li 19
// size n ---- li n-1
