package com.suji.oops;

public class MaruthiSwiftDezire extends MaruthiSwift {
	public int ecoSpeed;

	public MaruthiSwiftDezire (String color,int speed, int ecoSpeed) {
		super(color,speed,"sony");
		/*this.color = color;
		  this.carSpeed = speed;*/
		this.ecoSpeed = ecoSpeed;
	}

	@Override
	void speedUp(int speed) {
		carSpeed = carSpeed + speed;
	}

	public void setecoSpeed(int speed) {
		ecoSpeed = speed;
	}

	public int getecoSpeed() {
		return ecoSpeed;

	}

}
