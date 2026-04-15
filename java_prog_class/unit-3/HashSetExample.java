//Program to implement the set interface
import java.util.*;	
class HashSetExample
{
	public static void main(String args[])
	{
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Raju");
		set.add("Sai");
		set.add("Ramu");
		set.add("Srinu");
		Iterator <String> itr = set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}