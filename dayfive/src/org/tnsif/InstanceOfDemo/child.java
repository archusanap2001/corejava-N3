package org.tnsif.InstanceOfDemo;

public class child extends person {
	private int age;
	//getters and setters

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
//default constructor
	public child() {
		super();
	
	}
//parameterized constructor	

public child(String name,String address,int age) {
	super();
	this.age = age;
}

@Override
public String toString() {
	return "child [age=" + age + ", getAge()=" + getAge() + ", getName()=" + getName() + ", getAddress()="
			+ getAddress() + "]";
}



	
	
	


}
