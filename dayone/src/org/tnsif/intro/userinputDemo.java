package org.tnsif.intro;
import java.util.Scanner;
//to demostrate the example on user-input


public class userinputDemo {
	public static void main(String[] args) {
		java.util.Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		float y=sc.nextFloat();
		char z=sc.next().charAt(0);
		String name=sc.next();
		String str=sc.nextLine();
		double d=sc.nextDouble();
		System.out.println("The value of x is: "+x);
		System.out.println("The value of y is: "+y);
		System.out.println("The value of z is: "+z);
		System.out.println("The value of name is: "+name);
		System.out.println("The value of str is: "+str );
		sc.close();
		
		
	}

}
