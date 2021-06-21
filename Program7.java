//Write a program to find whether a number is prime or not 
package com.virtusa;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scan.nextInt();
		boolean flag=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
			}
		}
		if(flag==true)
		{
			System.out.println("Given number is Prime");
		}
		else
		{
			System.out.println("Given number is not Prime");
		}
	}

}
