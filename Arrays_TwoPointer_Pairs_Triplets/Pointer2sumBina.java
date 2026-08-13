import java.util.Scanner;
import java.util.Arrays;
class Pointer2sumBina
{
	public static boolean isSum(int a[],int n,int tar)
	{
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			if(Binary(a,n,a[i]))
			{
				return true;
			}
		}
		return false;
	}
	public static boolean Binary(int a[],int n,int x)
	{
		int l=0,r=n-1;
		while(l<=r)
		{
			int m=(l+r)/2;
			if(x==a[m])
			{
				return true;
			}
			else if(x<a[m])
			{
				r=m-1;
			}
			else{
				r=m+1;
			}
		}
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number");
		 int n= sc.nextInt();
		  System.out.println("enter the target number ");
		  int tar=sc.nextInt();
		 System.out.println("enter the Array elements");
		 int a[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		  System.out.println(" the sum of  number equals or not  "+isSum(a,n,tar));
		
	}
}