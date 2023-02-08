package org.tnsif.InstanceOfDemo;

import java.util.Scanner;

public class InstanceOfDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name,address and age");
		
		String name=sc.nextLine();
		String address=sc.nextLine();
		
		int age=sc.nextInt();
			
			//object creation
			child c=new child();
			child c1=new child(name,address,age);
			
			c1.setName(name);
			c1.setAddress(address);
			c1.setAge(age);
			
			System.out.println(c1);
			System.out.println(c instanceof  person);
			System.out.println(c1 instanceof  child);
		}

	}
 

