//Program to implement the map interface
import java.util.*;	
class MapExample
{
	public static void main(String args[])
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(100,"Ananda");
		map.put(300,"Balu");
		map.put(400,"Raj");
		map.put(500,"Deep");
		map.put(600,"RGV");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}