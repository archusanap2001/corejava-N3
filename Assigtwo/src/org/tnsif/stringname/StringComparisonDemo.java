package org.tnsif.stringname;

public class StringComparisonDemo {

	public static void main(String[] args) {
		//creating a string using operator
		String s1="TNSIF";
		String s2="TNSIF";
		
		//creating a string using new oprator
		String s3=new String("TNSIF");
		String s4=new String("TNSIF");
		
		//String Comparison
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s4));
		
		//using campare to
		System.out.println(s1.compareTo("tnsif"));//65-97=-32
		System.out.println(s1.compareToIgnoreCase("tnsif"));
		System.out.println(s1.compareTo(s2));
		
		
		

	}

}
