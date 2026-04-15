//Program to implement the set interface
import java.util.*;	
class HashSetExample1
{
	public static void main(String args[])
	{
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(69);
		set.add(52);
		set.add(45);
		Iterator <Integer> itr = set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}