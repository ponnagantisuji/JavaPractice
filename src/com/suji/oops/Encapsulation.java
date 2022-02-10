package com.suji.oops;

public class Encapsulation {

	public static void main(String[] args) {
		Tabletcapsule tab = new Tabletcapsule();
		tab.color = "yellow";
	
		tab.setmed1("paracetmal");
        tab.setmed2("azythromicine");
        System.out.println("Tablet color :"+tab.color);
        System.out.println("Tablet has medicine:"+tab.getmed1());
        System.out.println("Tablet has medicine:"+tab.getmed2());
	}

}
