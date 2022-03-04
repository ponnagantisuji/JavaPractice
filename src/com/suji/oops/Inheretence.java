package com.suji.oops;

public class Inheretence {

	public static void main(String[] args) {
		Vehicle v1= new MaruthiSwift("Red", 20 , "sony");
		System.out.println("car color : "+v1.color);
		System.out.println("car present speed:" +v1.carSpeed);
		v1.speedUp(30);
		System.out.println("car atfer speedup:"+v1.carSpeed);
		MaruthiSwift m1 = new MaruthiSwift( "yellow", 21,"Boss");
		System.out.println("musicSystem:" +m1.musicSystem);
		MaruthiSwift v2 = new MaruthiSwiftDezire("red",28, 30);
		System.out.println("dezire speed is:"+v2.carSpeed);
		//System.out.println("dezire eco speed is:"+v2.ecoSpeed);
		MaruthiSwiftDezire dezire= new MaruthiSwiftDezire ( "blue", 28,30);
		System.out.println("dezire eco speed is"+dezire.ecoSpeed);
		
		
		
		

	}

}
