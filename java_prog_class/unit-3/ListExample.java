//Program to implement the list interface
import java.util.*;	
class ListExample
{
	public static void main(String args[])
	{
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Sanju");
		ar.add("Hardik");
		ar.add("Bumrah");
		ar.add("Kohli");
		ar.add("Rohit");
		ar.add("Dhoni");
		ListIterator<String> ls = ar.listIterator(3);
		while(ls.hasNext())
		{
			String s = ls.next();
			System.out.println(s);
		}
	}
}
