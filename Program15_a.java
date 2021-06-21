/*	1
   222
  33333
 4444444
 */

package com.virtusa;

public class Program15_a {
	public static void main(String[] args) {
		int space=3;
		int num=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(' ');
			}
			for(int k=1;k<=num;k++)
			{
				System.out.print(i);
			}
			space--;
			num+=2;
			System.out.println();
		}
		
		
	}

}
