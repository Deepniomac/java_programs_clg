//Program for implicit type conversion
class ImplicitConversion
{
	public static void main(String args[])
	{
	byte b=10;
	byte a = 40;
	byte c = 5;
	int i;
	i = b;
	System.out.println("I = "+i + "\nB = "+b);
	double d = a*b/c;
	System.out.println("D = "+d);
}
}