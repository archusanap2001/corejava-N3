package org.tnsif.setdemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class StudentSetExecuter {

	//user defined method
	public static void addStudent(Set<Student>obj1)
	{
		Student s1=new Student(101,"Dhanashri",89.78f);
		Student s2=new Student(102,"Neha",49.78f);
		Student s3=new Student(103,"Priya",79.78f);
		obj1.add(s1);
		obj1.add(s2);
		obj1.add(s3);

		
	}
	public static void main(String[] args) {
		Set<Student>obj=new LinkedHashSet<>();
		addStudent(obj);
		for(Object o:obj)
		System.out.println(o);

	}


}
