package org.tnsif.expectionhandlingdemo;

import java.util.Scanner;

public class ArithmathicExpectionDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		int x=s.nextInt();
		int y=s.nextInt();
		//try block contain the exception code
		try {
		int res=x/y;
		System.out.println(res);
		}
		//catch block handle the exception thrown by try block
		catch(Exception e)
		{
			System.out.println("Exception Handled using catch:"+e);
		}
		finally
		{
			System.out.println("Finally Block");
		}
		
		

	}

}
