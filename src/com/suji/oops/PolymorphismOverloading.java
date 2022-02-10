package com.suji.oops;
/*
 * Method Overloading is also called as compile time polymorphism
 */
public class PolymorphismOverloading {
	public void print() {
		System.out.println("Printing");}
	public void print(String name) {
		System.out.println("Printing Name:" + name);}

	public static void main(String[] args) {
		PolymorphismOverloading p = new PolymorphismOverloading();
		p.print();
		p.print("krishna");
		// TODO Auto-generated method stub

	}

}
