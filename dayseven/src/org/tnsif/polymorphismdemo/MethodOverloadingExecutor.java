package org.tnsif.polymorphismdemo;

import java.util.Scanner;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the resolution and slottype"+"of a cellphone");
		int resolution=s.nextInt();
        s.nextLine();
        String slottype=s.nextLine();
        SmartPhone sp=new SmartPhone();
        sp.setResolution(resolution);
        sp.setSlottype(slottype);
        sp.display(resolution,slottype);
        
        
        Multiplication m=new Multiplication();
        System.out.println(m.mul(11,5));
        System.out.println(m.mul(5.2f,3));
		

	}

}
