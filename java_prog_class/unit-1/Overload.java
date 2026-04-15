//Example for Method Overloading
class Overload
{
	public void add()
	{
		int a=10,b=20;
		int c = a+b;
		System.out.println("C = "+c);
	}
	public void add(int a)
	{
		double b=20.2;
		double c = a+b;
		System.out.println("C = "+c);
	}
	public void add(double a,double b)
	{
		double c = a+b;
		System.out.println("C = "+c);
	}
} 
class MethodOverloadTest
{
	public static void main (String args[])
	{
		Overload ov = new Overload();
		ov.add();
		ov.add(10);
		ov.add(2.0,15.3);
	}
}