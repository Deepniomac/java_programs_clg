//Program to check whether the given String is palindrome or not
import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the String: ");
		str = sc.nextLine();
		StringBuffer str1 = new StringBuffer(str);
		str1.reverse();
		if(str.equals(str1.toString()))
		System.out.println("String " +str +" is palindrome");
		else
		System.out.println("String " +str +" is not palindrome");
	}
}