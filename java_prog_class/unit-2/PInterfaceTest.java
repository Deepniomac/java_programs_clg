//Partial implementation of an interface 
interface A
{
	void accept();
	void display();
	void get_info();
	void print_info();
}
abstract class X implements A
{
	public void accept()
	{
		System.out.println("Overrides A inside X");
	}
	public void display()
	{
		System.out.println("Overrides display A inside X");
	}
}
class Y extends X
{
	public void get_info()
	{
		System.out.println("Overrides A inside Y");
	}
	public void print_info()
	{
		System.out.println("Overrides prints A inside Y");
	}
}
class PInterfaceTest 
{
	public static void main(String args[])
	{
		Y ob1 = new Y();
		ob1.get_info();
		ob1.print_info();
	}
}