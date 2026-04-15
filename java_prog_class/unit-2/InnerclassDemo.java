//Nested class
class Outer
{
	int Outer_x = 100;
	void test()
	{
		Inner in = new Inner();
		in.display();
	}
	class Inner
	{
		void display()
		{
			System.out.println("Display: Outer_x = "+Outer_x);
		}
	}
}
class InnerclassDemo
{
	public static void main(String args[])
	{
		Outer ou = new Outer();
		ou.test();
	}
}