//toString() implementation
class A
{
	int x,y;
	void get_Data(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		String str;
		str = x + "%" + y;
		return str; 
	}
}
class toStringTest
{
	public static void main(String args[])
	{
		A ob = new A();
		ob.get_Data(5,25);
		System.out.println(ob);
	}
}