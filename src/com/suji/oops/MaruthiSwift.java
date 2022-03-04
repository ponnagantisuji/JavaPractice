package com.suji.oops;

public class MaruthiSwift extends Vehicle {
	public String musicSystem;

	public MaruthiSwift(String color, int speed, String musicSystem) {
		this.musicSystem = musicSystem;
		this.color = color;
		this.carSpeed = speed;
	}

	@Override
	void speedUp(int speed) {
		carSpeed = carSpeed + speed;
	}
}
