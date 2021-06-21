//Write a java program to reverse the string without using String inbuilt function
package com.virtusa;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string");
		String s=scan.next();
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}

}
