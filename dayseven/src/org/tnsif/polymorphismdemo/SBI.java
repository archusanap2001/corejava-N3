package org.tnsif.polymorphismdemo;
//clild class
public class SBI extends RBI {
	//overloading 
	float getInterest()
	{
		System.out.println(super.getInterest());
		return 12.8f;
	}

}
