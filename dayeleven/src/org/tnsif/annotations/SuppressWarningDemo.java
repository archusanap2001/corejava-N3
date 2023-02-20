package org.tnsif.annotations;
 import java.util.Scanner;
	public class SuppressWarningDemo {

		public static void main(String[] args) {
			@SuppressWarnings("resource")
			//this annotation is used to remove the warning at compile time.
			Scanner s=new Scanner(System.in);
			int x=s.nextInt();
			System.out.println(x);
		}

	}


