//Program to replace a string with given string in given statement
class Replace
{
	public static void main(String args[])
	{
		String text = "Hello My name is <Name>";
		String result = text.replace("<Name>","Ananda");
		System.out.println("The Original string is: "+text);
		System.out.println("With replaced String is: "+result);
	}
}