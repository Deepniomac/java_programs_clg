//Program to concatenate two strings
import java.util.*;
class StringConcatenate
{
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String S1 = new String();
		S1 = sc.nextLine();
		System.out.println("First String is: "+S1);
		System.out.println("Enter Second String: ");
		String S2 = new String();
		S2 = sc.nextLine();
		System.out.println("Second String is: "+S2);
		String S3 = S1.concat(S2);
		System.out.println("Concatenated String is: "+S3);
}
}