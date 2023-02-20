package org.tnsif.expectionhandlingdemo;
//program to demostrate on when finally block is not exception

public class TryCatchDemo {

	public static void main(String[] args) {
		
		try {
			int arr[]=new int[] {101,23,45};
			System.out.println("C2TC");
			//when it calls to system.exit(0);
			System.out.println(arr[3]);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled:"+e);
			//System.exit(0);
		}
		finally {
			//2.when finally block contain exception
			int res=12/0;
			System.out.println(res);	
			System.out.println("Finally Block");
		}

	}

}
