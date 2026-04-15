//Abstract class and abstract method
abstract class A
{
	abstract void callme();
	void callme2()
	{
		System.out.println("This is General method..");
	}
}
class B extends A
{
	void callme()
	{
		System.out.println("B has overridden the callme()");
	}
}
class AbstractDemo
{
	public static void main(String args[])
	{
		B ob = new B();
		ob.callme();
		ob.callme2();
	}
}