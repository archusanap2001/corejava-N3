package org.tnsif.stringname;
//program to demostrate an example on string creation 
import java.util.Scanner;

public class SampleStringName {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//using string literal
		System.out.println("Enter the first string:");
		String str1=s.nextLine();
		System.out.println("first String is: "+str1);
		
		//using new keyword
		System.out.println("Enter the secound string:");
		String str2=new String(s.nextLine());
		System.out.println("secound String is: "+str2);
		if(str1.equals(str2))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("different");
		}
		char c[]= {'H','e','l','l','o'};
		String str3=new String(c);
		System.out.println(str3);
	}

}
