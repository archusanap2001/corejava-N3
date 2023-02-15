package org.tnsif.stringname;

//program to demostrate on different  string operation
public class StringOprationDemo {

	public static void main(String[] args) {
		String s1=new String("Bhujble");
		String s2=s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s1.substring(4,5));
		System.out.println(s1.isEmpty());

	}

}
