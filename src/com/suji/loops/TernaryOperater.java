package com.suji.loops;

import java.util.Scanner;

public class TernaryOperater {

	public static void main(String[] args) {
		int salary;
		int percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a salary");
		salary = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter name :");
		String name = sc1.nextLine();
		System.out.println("entered name is:" + name);
		String designation = (salary > 10000) ? "officer" : "pune";
		/*
		 * (condition/Expression) ? value when it is True : value when it is False
		 */
		System.out.println("Mr."+name+ " is :" + designation+ " and his salary is : " +salary);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("enter a percentage:");
		percentage = sc2.nextInt();
		String eligibility = (percentage >= 70) ? "eligible " : "not eligible";
		System.out.println("mr."+name+ " percentage is: " + percentage+ " and he is :" +eligibility );
		

	}

}
