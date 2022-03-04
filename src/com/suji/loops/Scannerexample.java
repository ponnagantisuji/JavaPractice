package com.suji.loops;

import java.util.Scanner;
/*Reads two integers 
now of rows : 4 - i
no of coloumns : 3 - j

###
###
###
###
for(){
for(){
print
	}
}
*/

public class Scannerexample {

	public static void main(String[] args) {
		Scanner ob1 = new Scanner(System.in);
		System.out.println("enter value for i");
		int i = ob1.nextInt();
		System.out.println("value is:" + i);
		Scanner ob2 = new Scanner(System.in);
		System.out.println("enter value for j");
		int j= ob2.nextInt();
		System.out.println("value is :" +j);
		for(int k=0;k<i;k++) {
			for(int m=0;m<j;m++) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
		
	}
}
