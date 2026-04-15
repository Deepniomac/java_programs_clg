// super keyword to call the immediate super class constructor

class A 
{
	int a,b;
	A()
	{
		a = b = 0;
	}
	A(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	void display()
	{
		System.out.println("a = "+a +"\n" + "b = "+b);
	}
}

class B extends A 
{
	int x,y;
	
	B()
	{
		super();
		x = y = 0;
	}
	B(int a, int b, int x, int y)
	{	super(a, b);
		this.x = x;
		this.y = y;
		
	}
	
	void display()
	{
		super.display();
		System.out.println("x = "+x +"\n" + "y = "+y);
	}
}

class SuperTest1
{
	public static void main(String args [])
	{
		B b = new B();
		b.display();
		B b1 = new B(10, 20, 30, 40);
		b1.display();
	}
}