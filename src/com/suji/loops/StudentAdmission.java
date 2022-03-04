package com.suji.loops;

import java.util.Scanner;

public class StudentAdmission {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name");
		String name = sc.nextLine();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Roll Number :");
		int no = sc1.nextInt();
		System.out.println("entered number is:" + no);
		int s1 = readMarks();
		int s2 = readMarks();
		int s3 = readMarks();
		float percentage = getPercentage(s1,s2,s3);
		getAdmissioncard( no, name, percentage);

	}

	

	private static void getAdmissioncard(int no,String name,float percentage) {
		System.out.println("############## University Admission Prediction card ##########");
		System.out.println("name:" +name);
		System.out.println("no:" +no);
		System.out.println("percentage :"+percentage );
		String admissionChances = (percentage >= 70) ? "High " : "Low";
		System.out.println("Admissionchances are :" + admissionChances);
	}



	private static float getPercentage(int s1, int s2, int s3) {
		float percentage = (s1+s2+s3)/3;
		System.out.println("Percentage is :" +percentage);
		
		return percentage;
	}



	private static int readMarks() {
		System.out.println("Enter Student marks :");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		System.out.println(" Student marks are :" + marks);

		return marks;
	}

	
		
}