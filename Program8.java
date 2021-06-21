//Write a java program to find whether a string or number is palindrome or not
package com.virtusa;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		System.out.println("enter a string or a number");
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c=s1.charAt(i);
			s2=s2+c;
		}
		if(s2.equals(s1))
		{
			System.out.println("given string/Number is palindrome");
		}
		else 
		{
			System.out.println("given string/Number is not a palindrome");
		}
	}

}
