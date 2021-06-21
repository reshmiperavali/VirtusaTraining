//Take the input from user and check number is Palindrome or not in java

package com.virtusa;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		int n=num;
		int n1=0;
		String s="";
		while(num>0)
		{
			n1=num%10;
			num=num/10;
			s=s+n1;
		}
		int n2=Integer.parseInt(s);
		if(n==n2)
		{
		System.out.println("Given number is Palindrome");
		}
		else
		{
			System.out.println("Given number is Not a palindrome");
		}
		
	}

}
