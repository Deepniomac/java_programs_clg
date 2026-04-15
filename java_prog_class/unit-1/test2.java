import java.io.* ;

class X 
{
	public void hello()
	{
		System.out.println("Welcome to X class");
	}
}

class Y
{
	public void hello()
	{
		System.out.println("Welcome to Y class");
	}
	
}

class Z 
{
	public void hello()
	{
		System.out.println("Welcome to Z class");
	}
}

class Test3 
{
	public static void main (String args[])
	{
		X ob = new X ();
		Y ob1 = new Y ();
		Z ob2 = new Z ();
		ob.hello();
		ob1.hello();
		ob2.hello();
	}
}