//Write a java program to check if the given number Palindrome or not
import java.io.*;
import java.util.*;
class Palin
{
	public static void main(String args[])
	{
		int N,rev=0,d,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value: ");
		N = sc.nextInt();
		temp = N;
		while(N>0)
		{
			d = N%10;
			rev = (rev*10)+d;
			N = N/10;
		}
		if (temp==rev)
		System.out.println("The given number " +temp + " is palindrome.");
		else
		System.out.println("The given number " +temp + " is not palindrome.");
	}
}