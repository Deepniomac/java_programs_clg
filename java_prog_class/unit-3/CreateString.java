//Program to Creating the string from another string
class CreateString
{
	public static void main(String args[])
	{
		char ch[] = {'a','n','a','n','d','a'};
		String str = new String(ch);
		System.out.println("Created String is: "+str);
		String str1 = new String(str);
		System.out.println("Created another String is: "+str1);
	}
}