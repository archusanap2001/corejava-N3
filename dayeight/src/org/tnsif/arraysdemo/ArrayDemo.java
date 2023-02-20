package org.tnsif.arraysdemo;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.of elements"+ " in the array");
		int n=s.nextInt();
		//array declaration
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Array element are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		//to sort an array element
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("Sorted element are");
		for(int itr:arr)
		{
			System.out.println(itr+" ");
		}
		
		

	}

}
