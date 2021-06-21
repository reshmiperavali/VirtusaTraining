//Write a java program to remove all white spaces in a string
package com.virtusa;

import java.util.Scanner;

public class Program11 {
public static void main(String[] args) {
		
		System.out.println("enter the string");
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		String[] s2=s1.split(" ");
		for(int j=0;j<=s2.length-1;j++)
		{
			System.out.print(s2[j]);
		}
	}

}
