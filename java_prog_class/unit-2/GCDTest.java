//Program to find GCD of two numbers using recursion
import java.util.*;
class FindGCD
{	
	int gcd(int m,int n)
	{
		if(m<n)
		gcd(n,m);
		if(n==0)
		return m;
		else
		return gcd(n,m%n);
	}
}
class GCDTest
{
	public static void main(String args[])
	{
		int m,n;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter m,n values: ");
		m = sc.nextInt();
		n = sc.nextInt();
		FindGCD fg = new FindGCD();
		System.out.println("The GCD of "+m + "," +n + " : " +fg.gcd(m,n));
	}
}