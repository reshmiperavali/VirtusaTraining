
//Write java program to find if a number is power of 2

package com.virtusa;

import java.util.Scanner;

public class Program16 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		if(checkPower(n))
		{
			System.out.println("Given number is power of 2");
		}
		else
		{
			System.out.println("Given number is not power of 2");
		}
		
	}
		public static boolean checkPower(int n)
		{
			if(n==0)
			{
				return false;
			}
			while (n != 1)
			{
				if (n % 2 != 0)
					return false;
				n = n / 2;
			}
			return true;
		}
}
