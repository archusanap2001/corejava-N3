package org.tnsif.hierachicalinheritance;
//to demonstrate on hierarchical inheritance
//parent class
public class Androidversion {
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Androidversion() {
		System.out.println("Parent class-Android version");
	}

	public Androidversion(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "AndroidVersion [type=" + type + "]";
	}
	

}
