//Java Program for Member Access control
class A
{
	int i;
	private	int j;
	void set_IJ(int x,int y)
	{
		i = x;
		j = y;
	}
}
class B extends A
{
	int total;
	void sum()
	{
		total = i+j; 	//Error Private property cannot be inherited
	}
}
class Access
{
	public static void main(String args[])
	{
		B ob = new B();
		ob.set_IJ(2,5);
		ob.sum();
		System.out.println("Total: "+ob.total);
	}
}