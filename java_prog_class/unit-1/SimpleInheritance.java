class A				//Superclass
{
	int 	x;
	double	y;
	public void get_XY( )
	{
		x=10;
		y=11.3;
	}
	public void display_XY( )
	{
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
	}
}
class B extends A   //Subclass
{
	int i,j;
	public void get_IJ( )
	{
		i=20;
		j=11;
	}
	public void display( )
	{

		System.out.println("I: "+i);
		System.out.println("J: "+j);
	}
}
class Simple_Inheritance
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.get_XY();
		obj.display_XY();
		obj.get_IJ();
		obj.display();
	}
}

