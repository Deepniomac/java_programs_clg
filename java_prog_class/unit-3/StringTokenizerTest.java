//Program to implement StringTokenizer class
import java.util.*;
class StringTokenizerTest
{
	static String in = "I am so delighted to;put.the"+ 
						" Vision and Mission; and.continuous" +
						" development.of the; Department of;" + 
						" .CSSE";
	public static void main(String args[])
	{
		StringTokenizer st = new StringTokenizer(in,";.");
		while(st.hasMoreTokens())
		{
			String key = st.nextToken();
			System.out.println(key+ "\n");
		}
	}
}