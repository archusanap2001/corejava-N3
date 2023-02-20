package org.tnsif.abstractiondemo;
// prgram to demostrate on abstract class and abstract method
//abstract class
//class cannot be final abstract

public abstract class Menu {
	//abstract method
	abstract void recipe();
	abstract void foodtype();
	//concreate method
	void menuType()
	{
		System.out.println("Veg and Nonveg");
	}
	

}
