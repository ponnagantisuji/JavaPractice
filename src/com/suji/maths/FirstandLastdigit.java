package com.suji.maths;

import java.util.Scanner;

public class FirstandLastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob1 = new Scanner(System.in);
		System.out.println("Enter a value : ");
       int a = ob1.nextInt();
       int b = a % 10;
       System.out.println("Last  digist is :"+b);
       while(a>=10) {
    	   a/=10;
       }  
       System.out.println("First number is :" +a);
       
	}

}
