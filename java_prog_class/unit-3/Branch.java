//Deciding the branch with given string
import java.util.*;
class Branch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Regd.No: ");
		String str = new String();
		str = sc.nextLine();
		char ch;
		ch = str.charAt(7);
		switch(ch)
		{
			case '2':System.out.println("EEE Branch");
				break;
			case '5':System.out.println("CSSE Branch");
				break;
			case '4':System.out.println("ECE Branch");
				break;
			case '3':System.out.println("MECH Branch");
				break;
			default:System.out.println("Invalid");
		}
	}
}