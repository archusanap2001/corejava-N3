package org.tnsif.arraysdemo;
//program to demostrate on array objects
public class Student {
	//priavte data members
	private int rollno;
	private String name;
	private float Percentage;
	//getters and setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return Percentage;
	}
	public void setPercentage(float percentage) {
		Percentage = percentage;
	}
	//parametrized constructor
	public Student(int rollno, String name, float percentage) {
		super();
		this.rollno = rollno;
		this.name = name;
		Percentage = percentage;
	}
	
	

}
