//Write a java program to find second highest number in array
package com.virtusa;

import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of an array");
		int n=scan.nextInt();
		System.out.println("enter elements to an array");
		int[] a1=new int[n];
		int j,i,temp;
		for(i=0;i<=a1.length-1;i++)
		{
			a1[i]=scan.nextInt();
		}
		for(int c=1;c<=a1.length-1;c++)
		{
			for(j=0;j<=a1.length-2;j++)
			{
				if(a1[j]<a1[j+1])
				{
					temp=a1[j];
					a1[j]=a1[j+1];
					a1[j+1]=temp;
				}
			}
			
		}
		int num=0;
		for(int m=0;m<=a1.length-1;m++)
		{
		num=a1[1];
		
		}
		System.out.println("Second highest element in array  is: "+num);
	}

}
