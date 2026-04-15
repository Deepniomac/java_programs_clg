//Program for explicit type conversion
class ExplicitConversion
{
	public static void main(String args[])
	{
	byte b;
	int i=257;
	double d = 323.142;
	b = (byte)i;
	System.out.println("I = "+i + "B = "+b);
	i = (int)d;
	System.out.println("I = "+i + "D = "+d);
	b = (byte)d;
	System.out.println("D = "+d + "B = "+b);
}
}