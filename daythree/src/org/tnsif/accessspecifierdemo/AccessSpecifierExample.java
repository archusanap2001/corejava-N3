package org.tnsif.accessspecifierdemo;

public class AccessSpecifierExample {
	//data members
	private String name;
	public void display()
	{
		System.out.println("The name is:"+name);
	}
	//getters and setters for private data members
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
