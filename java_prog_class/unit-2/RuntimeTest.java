//Program to implement runtime polymorphism
class A
{
	void display()
	{
		System.out.println("This is A class display....");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("This is B class display....");
	}
}
class C extends B
{
	void display()
	{
		System.out.println("This is C class display....");
	}
}
class RuntimeTest
{
	public static void main(String args[])
	{
		A ob;		//Reference Variable
		B ob1 = new B();
		C ob2 = new C();
		ob = ob1;
		ob = ob2;
		ob = new A();
		ob.display();
	}
}