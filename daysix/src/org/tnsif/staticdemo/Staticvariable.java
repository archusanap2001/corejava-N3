package org.tnsif.staticdemo;

public class Staticvariable {
	
	private String name;
	
	public static String companyname="TechnoServer India";
	
	//paramerized
	public Staticvariable(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Staticvariable [name=" + name + "]";
	}


	
}

