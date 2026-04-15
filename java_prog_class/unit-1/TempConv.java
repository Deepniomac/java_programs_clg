//Write a java program to convert the Fahrenheit to Centigrade temperature
import java.io.*;
import java.util.*;
class TempConv
{
	public static void main(String args[])
	{
		double F,C;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fahrenheit Temperature: ");
		F = sc.nextDouble();
		C = ((F - 32.0)*5.0)/9.0;
		System.out.print("For the Given Fahrenheit " +F + " equivalent Centigrade is: "+C);
	}
}