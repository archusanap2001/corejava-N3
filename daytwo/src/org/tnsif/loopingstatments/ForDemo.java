package org.tnsif.loopingstatments;
import java.util.Scanner;


public class ForDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1; i<=n; i++)
		{
			System.out.println(i+" ");
		}
			System.out.println();
			for(int i=1; i>=n; i--)
			{
				System.out.println(i+" ");
			}
		
	}

}
