package org.tnsif.functionrecursion;

import java.util.Scanner;

public class FactorialUsingFunction {
	//function defination
	static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		//fun call
		System.out.println("factorial of the:"+factorial(num));
		sc.close();
		

	}

}
