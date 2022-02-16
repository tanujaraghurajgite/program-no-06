//write a program in java to print diamond patten
import java.io.*;
import java.util.*;
class starpattern
{
	public static void main(String args[])
	{
	
		for(int j=1;j<=10;j++)
		{
			for(int k=9;k>=j;k--)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=j;i++)
			{
				System.out.print("* ");
			}
			System.out.println("\n");
		}
		for(int m=1;m<=10;m++)
		{
			for(int n=1;n<=m;n++)
			{
				System.out.print(" ");
			}
			for(int p=9;p>=m;p--)
			{
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
}