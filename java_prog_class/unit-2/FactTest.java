//Program to find factorial of a number using recursive method
import java.util.*;
class Factorial
{
	long fact(long n)
	{	
		if(n==0||n==1)
		return 1;
		else
		return(n*fact(n-1));
	}
}
class FactTest
{
	public static void main(String args[])
	{
		long n;
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the n value: ");
		n = sc.nextLong();
		Factorial fa = new Factorial();
		System.out.println("The factorial of given number: "+fa.fact(n));
			
	}
}