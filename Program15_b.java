/* 1
  212
 32123
 */



package com.virtusa;

public class Program15_b {
	public static void main(String[] args) {
		int space=2;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(' ');
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			for(int z=2;z<=i;z++)
			{
				System.out.print(z);
			}
			space--;
			System.out.println();
		}
	}

}
