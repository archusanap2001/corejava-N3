package org.tnsif.arraysdemo;
import java.util.Scanner;

public class MultiDimentionalarray {

	public static void main(String[] args) {
		
	//int[][] a= {{10,20,30},{34,56,89}}
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int m=s.nextInt();
	int arr[][]=new int[n][m];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++) {
			arr[i][j]=s.nextInt();
			
		}
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println(arr[0][1]);//34
	System.out.println(arr[1][1]);//78
	
}
}