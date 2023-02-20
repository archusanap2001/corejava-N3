package org.tnsif.expectionhandlingdemo;

import java.util.Scanner;

public class NestedByCatchDemo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int arr[]=new int[] {11,22,33};
		try {
			
			try {
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception handled "+e);
			}
			int res= x/y;
			System.out.println(res);
			
			
		}
		finally
		{
			System.out.println();
		}
		

	}

}
