package com.suji.oops;

public class MarutiSwift extends Vehicle {
	public MarutiSwift(String color, int speed) {
		this.color = color;
		this.carSpeed = speed;
	}
	
	void speedUp(int speed) {
		carSpeed = carSpeed + speed;
	}

}
