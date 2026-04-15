//program to implement method overriding
class A
{
	int a,b;
	A(int a, int b)
	{
		this.a=a;
		this.b=b;		
	}
	void show()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}	
}
class B extends A
{
	int x,y;
	B(int a,int b,int x,int y)
	{
		super(a,b);
		this.x=x;
		this.y=y;
		
	}
	void show()
	{
		System.out.println("x="+x);
		System.out.println("y="+y);
	}	
}
class OverrideTest
{
	public static void main(String args[])
	{
		B ob =new B(10,20,100,200);
		ob.show();
	}
}


