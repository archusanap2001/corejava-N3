package org.tnsif.loopingstatments;
import java.util.Scanner;

public class WhileLoopDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
	{
		System.out.println(i+"");
		i++;
	}
		System.out.println();
		i=1;
		while(n>=i)
		{
			System.out.println(n+" ");
			n--;
		}
	
}
}
