//program to implement the multilevel inhertance
class A
{
	int a,b;
	A(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
}
class B extends A
{
	int x,y;
	B(int a,int b,int c,int d)
	{
		super(a,b);
		x=c;
		y=d;
	}
}
class C extends B
{
	int i,j;
	C(int a,int b, int c,int d,int e ,int f)
	{
		super(a,b,c,d);
		i=e;
		j=f;
	}
	public void display()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
}
class MultilevelTest1
{
	public static void main(String args[])
	{
	
		C ob = new C(10,20,30,40,50,60);
		ob.display();
	}
}