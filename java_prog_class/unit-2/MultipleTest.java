//Java Program to implement the multiple inheritance
interface A
{
	void display();
	
}
/*interface B
{
	void Print_info();
}*/
class B
{
	public void Print_info()
	{
		System.out.println("This is B display...");
	}
}
class C extends B implements A 
{
	public void display()
	{
		System.out.println("This is A display...");
	}
	/*public void Print_info()
	{
		System.out.println("This is B display...");
	}*/
}
class MultipleTest
{
	public static void main(String args[])
	{
		C ob = new C();
		ob.display();
		ob.Print_info();
	}
}