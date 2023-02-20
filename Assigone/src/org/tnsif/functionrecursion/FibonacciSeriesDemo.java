package org.tnsif.functionrecursion;
//program to find the nth term in the fibonacci series using recursion
import java.util.Scanner;

public class FibonacciSeriesDemo {
	static int n1=10,n2=1,n3=0;
	private static int count;
	static void fibonnacci(int count)
	{
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(""+n3);
			fibonnacci(count-1);
			
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=s.nextInt();
		System.out.println(n1+" "+n2);
		fibonnacci(num-2);
	}
	

}
