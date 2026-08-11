import java.util.Scanner;
class Matrix
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String input=sc.nextLine();
		int n=(int)Math.ceil(Math.sqrt(input.length()));
		char [][]ch=new char[n][n];
		int k=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(k<input.length())
				{
					ch[i][j]=input.charAt(k++);
				}
				else
				{
					ch[i][j]='_';
				}
			}
		}
		StringBuilder str=new StringBuilder();
		for(int j=0;j<n;j++)
		{
			for(int i=0;i<n;i++)
			{
			  str.append(ch[i][j]);
			}
		}
		System.out.println("The String is"+str.toString());
		
		
	}
}

import java.util.*;
class SpiralMatrix
{
	public static void matrix(int mat[][])
	{
		int n=mat.length;
		int m=mat[0].length;
		int top=0,bot=n-1;
		int l=0,r=m-1;
		while(top<=bot && l<=r)
		{
			for(int i=l;i<=r;i++)
			{
				System.out.print(mat[top][i]+" ");
			}
			top++;
			for(int i=top;i<=bot;i++)
			{
				System.out.print(mat[i][r]+" ");
			}
			r--;
			if(top<=bot){
				for(int i=r;i>=l;i--)
				{
					System.out.print(mat[bot][i]+" ");
				}
                bot--;
            }
            if(l<=r)
			{
				for(int i=bot;i>=top;i--)
				{
					System.out.print(mat[i][l]+" ");
				}
				l++;
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Enter matrix: ");
		int mat[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		matrix(mat);
	}
}
import java.util.*;
class StringEncrypt
{
	public static String encode(String s)
	{
		String str[]=s.split(" ");
		StringBuilder res=new StringBuilder();
		for(String word:str)
		{
			int strlength=word.length();
		    String revstr=new StringBuilder(word).reverse().toString();
			res.append("[").append(strlengt ).append("]")

               .append(revstr).append("[").append(strlength).append("]_");
		}
		if(res.length()>0)
		{
			res.setLength(res.length()-1);
		}
		return res.toString();
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		System.out.println(encode(s));
	}
}


