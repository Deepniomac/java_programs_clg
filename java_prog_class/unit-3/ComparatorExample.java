//Program to implement Comparator interface
import java.util.*;
class ComparatorExample
{
	public static void main(String args[])
	{
		List<String> ls = new LinkedList<>();
		ls.add("Tilak");
		ls.add("Ishan");
		ls.add("Puli");
		ls.add("Dube");
		ls.add("Axar");
		ls.add("Sky");
		System.out.println("The List given as: "+ls);
		Iterator<String> it = ls.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		//Removing the last element
		it.remove();
		System.out.println("After removing the last element: "+ls);
	}
}