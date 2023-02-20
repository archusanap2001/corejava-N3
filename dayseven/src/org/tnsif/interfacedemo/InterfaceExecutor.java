package org.tnsif.interfacedemo;

public class InterfaceExecutor {

		public static void main(String[] args) {
			//Bike b=new Bike(); we can't instantiate interface 
			Avenger a=new Avenger();
			a.engine();
			a.milage(45);
			a.milage(34);
		}

	}


