package org.tnsif.customexception;
import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
	
		String password=s.nextLine();
		try {
			if(id.equals("shraddhab399@gmail.com") && password.equals("shraddha@123"))
			{
				System.out.println("credential MAtched");
			}
			else
				throw new loginCredential("invalid credential");
		} 
		catch(loginCredential e) {
			System.out.println("Exception Handled"+e);
		}
		finally {
			System.out.println("finally block");
		}
	}

}