package com.suji.loops;

import java.time.LocalDate;
import java.util.Scanner;

import com.suji.util.MyUtils;

public class CurrentBill {
	private static final int SERVICE_CHARGE = 10;
	private static final int GST = 15;
	public static void main(String[] args) {
		int cmr = MyUtils.readInteger("CMR");
		int omr =  MyUtils.readInteger("OMR");
		String name = MyUtils.readString("Custemer Name");
		printBill(cmr,omr,name);
  
		
	}

	private static void printBill(int cmr, int omr ,String name) {
		System.out.println(cmr +  " " + omr + " " + name ); 
		System.out.println("#############  AP Electricity Board   ##############");
		System.out.println("Date :" + LocalDate.now());
		System.out.println("Name : " +name);
		System.out.println("No of Units Consumed " +(cmr-omr));
		System.out.println("Total charges to be Paid " +getTotalBill(omr,cmr));
		System.out.println("Due Date : " + (LocalDate.now().plusDays(40)));
		
	}

	private static int getTotalBill(int omr, int cmr) {
		int billAmount = (cmr - omr) * 5;
		int serviceCharge = (billAmount * 10 / 100);
		int gst = (billAmount * 20 / 100);
		int total = (billAmount + serviceCharge + gst);
		System.out.println("Consumed units Charges : " +billAmount);
		System.out.println("Service Charge: (10 %) :" + serviceCharge);
		System.out.println("GST:" +gst);
		System.out.println("total :" +total);
		return total;
	}

		
}
