package org.tnsif.Looping;
import java.util.Scanner;

public class TotalDigitNumber {
	public static void main(String[] args) {
		/*int count=0,num=456;
		  while(num!=0){
		  num/=10;
		  ++count;
		  }
		  System.out.println("The number of digit is "+count);*/
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int count=0;
		//int n=3;
		while(num!=0) {
			num/=10;
			++count;
		}
		 
		 
	}

}
