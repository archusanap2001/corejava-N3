package org.tnsif.Supereyword;

public class Flower {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Flower() {
		System.out.println("Flower -parent class");
	}

	public Flower(String name) {
		super();
		this.name = name;
	}
	
	

	

	}


