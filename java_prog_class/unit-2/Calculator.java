package rajmath;
public class Calculator
{
	int a,b,c;
	public void add(int a,int b)
	{
		c = a+b;
		System.out.println("The Addition of a&b: "+c);
	}
	public void sub(int a,int b)
	{
		c = a-b;
		System.out.println("The Substraction of a&b: "+c);
	}
	public void mul(int a,int b)
	{
		c = a*b;
		System.out.println("The Multiplication of a&b: "+c);
	}
	public void div(int a,int b)
	{
		c = a/b;
		System.out.println("The Division of a&b: "+c);
	}
}
