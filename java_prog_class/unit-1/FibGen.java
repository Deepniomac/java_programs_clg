//Write a java program to generate the fibonacci series
import java.io.*;
import java.util.*;
class FibGen
{
	public static void main(String args[])
	{
		int f0=1,f1=1,n,i=2,f2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		n = sc.nextInt();
		System.out.println("The Fibonacci Series is: ");
		System.out.println("__________________________");
		System.out.print(" "+ f0);
		System.out.print(" "+ f1);
		while(i<=n)
		{
			f2 = f0 + f1;
			System.out.print(" "+ f2);
			f0 = f1;
			f1 = f2;
			i++;
		}
	}
}