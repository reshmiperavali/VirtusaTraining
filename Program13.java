

package com.virtusa;

import java.util.Scanner;

public class Program13 { 
	public static void main(String[] args) {
		System.out.println("Enter the salary: ");
		Scanner scan=new Scanner(System.in);
		double tax=0.0;
		int sal=scan.nextInt();
		if(sal<=50000)
		{
			System.out.println("Nill");
		}
		else if((sal<=60000)&&(sal>50000))
		{
			tax=sal/100*10;
			System.out.println("Tax: "+tax);
		}
		else if((sal>60000)&&(sal<=150000))
		{
			tax=(sal/100)*20;
			System.out.println("Tax: "+tax);
		}
		else
		{
			tax=(sal/100)*30;
			System.out.println("Tax: "+tax);
		}
		
	}

}
