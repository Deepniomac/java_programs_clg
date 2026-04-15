//Program
class ParseInt
{
	public static void main(String args[])
	{
		String S = "10";
		int a = 20;
		int b = Integer.parseInt(S);  	//Wrapperclass
		int c  = a + b;
		System.out.println("The addition of "+a  +" + " + b +":"+c);
	}
}