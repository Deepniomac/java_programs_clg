//program to implement the multilevel inhertance
class A
{
	int a,b;
	A()
	{
		a=10;
		b=20;
		
	}
}
class B extends A
{
	int x,y;
	B()
	{
		x=30;
		y=40;
	}
}
class C extends B
{
	int i,j;
	C()
	{
		i=50;
		j=60;
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
class MultilevelTest
{
	public static void main(String args[])
	{
		A ob=new A();
		B ob1 = new B();
		C ob2 = new C();
		ob2.display();
	}
}