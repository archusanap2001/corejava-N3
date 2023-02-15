package org.tnsif.staticdemo;

public class StaticDemo {
	private static double salary=45000.67;
	public static void display() {
		System.out.println("salary is:"+salary);
		
	}
	//getters and setters
	public static double getSalary() {
		return salary;
	}
	public static void setSalary(double salary) {
		StaticDemo.salary = salary;
	}
	

}
