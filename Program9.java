//Write a java program to find duplicate characters in string
package com.virtusa;

import java.util.Scanner;

public class Program9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=scan.next();
		String s1="";
		String s2="";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(s1.indexOf(ch)==-1)
			{
				s1=s1+ch;
				
			}
			else
			{
				s2=s2+ch;
			}
		}
		System.out.println("Duplicate characters in String are: "+s2);
	}

}
