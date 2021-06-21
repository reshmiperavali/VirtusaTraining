//Write a program to remove duplicates from array in java
package com.virtusa;

import java.util.Scanner;

public class Program3 {
	public static int removeDuplicates(int a[],int n){
		if(n==0 || n==1){
		return n;
		}
		
		int[]temp = new int[n];
		int j=0;
		
		for(int i=0;i<n-1;i++){
			if(a[i]!=a[i+1]){
				temp[j++]=a[i];
				
			}
		}
		temp[j++] = a[n-1];
		
		for(int i=0;i<j;i++){
			a[i]=temp[i];
			
		}
		return j;
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,5,3,3,6,7,7,8,8,9,10};
		int n= a.length;
		
		n=removeDuplicates(a,n);
		for(int i=0;i<n;i++){
			System.out.print(a[i] + " ");
		}

	}

}
	/*public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of an array");
		int n=scan.nextInt();
		System.out.println("enter elements to an array");
		int[] a1=new int[n];
		int[] a2=new int[n];
		
		for(int i=0;i<=a1.length-1;i++)
		{
			a1[i]=scan.nextInt();
		}
		for(int z=0;z<=a1.length-1;z++)
		{
			for(int j=0;j<=a1.length-1;j++)
			{
				for(int k=0;k<=a1.length-1;k++)
				{
					if((a1[j]!=a1[k])&&j!=k)
					{
						a2[z]=a1[k];
						
					}
				}
			}
		}
		for(int z=0;z<=a2.length-1;z++)
		{
			System.out.println(a2[z]);
			
		}
		
	}*/
	

