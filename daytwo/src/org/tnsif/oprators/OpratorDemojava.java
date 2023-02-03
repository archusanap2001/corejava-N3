package org.tnsif.oprators;
import java.util.Scanner;

public class OpratorDemojava {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x and y ");
		int x=s.nextInt();
		int y=s.nextInt();
		//arithmatic operator
		//System.out.println(x+y);
		//System.out.println(x-y);
		//System.out.println(x*y);
		//System.out.println(x/y);
		
		//relation operator
		//booean res=x>y;
		//System.out.println(res);
		  //assignment operator
        // x*=y; //x=x*y;
        // System.out.println(x);
         
         //logical operator
         //boolean res2=(5==5)&&(5>3); //true
         //boolean res3=(5==3)&&(5>2); //true
         //boolean res4=!(5==4); //true
         //System.out.println(res2);
         //System.out.println(res3);
         //System.out.println(res4); 
         
         //bitwise
         //int a=12& 5;
         //int b=12|5;
         //int c=12^5;
         //System.out.println(a);
         //System.out.println(b);
         //System.out.println(c);
         
         //ternary operator
         //String res=(12%2==0)?"true":"false";
         //System.out.println(res);
         
         //increment and decrement
         int p= x++;//
         int q=--x;
         System.out.println(q);
         
	}

		
	}


