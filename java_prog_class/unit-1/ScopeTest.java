//Scope of the variable
class ScopeTest
{
	public static void main(String args[])
	{
		int x=10;		//Belongs to main block
		if(x==10)
		{
			int y=20;		//Inner block
			System.out.println("X="+x + "\n" + "Y="+y);
			x=y*2;
		}
		y=100;				//Error
		System.out.println("X="+x);
	}
}