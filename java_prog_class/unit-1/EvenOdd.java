//Write a Java program to take input as Integer array and print 
//even indexed even numbers and odd indexed odd numbers. 
import java.util.*;
class EvenOdd
{
	public static void main(String args[])
	{
		int []b = new int [10];
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Elements into the array: ");
		for(int i=0;i<b.length;i++)
		{
			b[i] = sc.nextInt();
		}
		System.out.println("Even indexed even numbers are: ");
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2==0&&i%2==0)
			System.out.print ("b["+i+"]="+b[i]+"\n");
		}
		System.out.println(" ");
		System.out.println("Odd indexed Odd numbers are: ");
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2!=0&&i%2!=0)
			System.out.print ("b["+i+"]="+b[i]+"\n");
		}
	}
}