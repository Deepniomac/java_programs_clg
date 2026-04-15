//Program to compare the given two strings
import java.util.*;
class CompareString
{
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String S1 = new String();
		S1 = sc.nextLine();
		System.out.println("Enter Second String: ");
		String S2 = new String();
		S2 = sc.nextLine();
		int k;
		k = S1.compareTo(S2);
		if(k==0)
		System.out.println("Both Strings are equal..");
		else if (k<0)
		System.out.println("First String is less than Second String");
		else
		System.out.println("First String is greater than Second String");
	}
}