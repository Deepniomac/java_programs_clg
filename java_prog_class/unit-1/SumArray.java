//Write a program to find the sum of the given array elements
import java.util.*;
class SumArray
{
	public static void main(String args[])
	{
		int[] a = new int[10];
		int Sum = 0,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values into the array: ");
		for(i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		for(int x:a)
			 Sum += x;
		 
			System.out.print("\nThe SUM of array elements are:  "+Sum);
	}
}