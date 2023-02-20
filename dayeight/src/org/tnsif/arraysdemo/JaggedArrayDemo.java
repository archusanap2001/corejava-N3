package org.tnsif.arraysdemo;
import java.util.Scanner;
public class JaggedArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[][]=new int[2][];
		//maling above array jagged
		arr[0]=new int[3]; //1st contain 3 column
		arr[1]=new int[2]; //2nd contain 2 column
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=s.nextInt();
				
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) 
			{
				System.out.println(arr[i][j]+" ");
			}
		
		
		}
	}
}
		
		




