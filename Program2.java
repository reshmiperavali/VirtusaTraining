//CREATE Java program to check if the given number is Amstrong or not
package com.virtusa;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		//Scanner scan=new Scanner(System.in);
		//int n=scan.nextInt();
		int n=220;
		int n1=n;
		int result=0;
		int rem=0;
		while(n1!=0)
		{
			rem=n1%10;
			result=result+rem*rem*rem;
			n1=n1/10;
		}
		if(result==n)
		{
			System.out.println("Given number is amstrong");
		}
		else
		{
			System.out.println("Given number is not amstrong");
		}
		
	}

}
