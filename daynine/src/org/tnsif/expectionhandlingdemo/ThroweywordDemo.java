package org.tnsif.expectionhandlingdemo;

import java.io.IOException;

public class ThroweywordDemo {
	
	public static void donate(int age,int weight) throws Exception
	{
		
	if(age>18 && weight>50)
		System.out.println("Eligble to donate the Blood");
	else
		//to throw an exception explicity
		throw new IOException("Not Eligible");
	}
	public static void main(String[] args) throws Exception{
	try
	{
		donate(17,55);
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
}
}
