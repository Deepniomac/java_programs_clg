//Write a java program to reverse the given number
import java.io.*;
import java.util.*;
class Rev
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
		System.out.println("The reverse of " +temp + " : " +rev);
	}
}