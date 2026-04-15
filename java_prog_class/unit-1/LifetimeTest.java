//Lifetime of the variable
class LifetimeTest
{
	public static void main(String args[])
	{
		int x=10;		//Belongs to main block
		if(x==10)
		{
			int y=20;		//Inner block
			System.out.println("X="+x + "\n" + "Y="+y);
			x=y*2;
			System.out.println("X="+x);
		}
		int y=100;				//Error
		System.out.println("Y="+y);
	}
}