//program2 for this keyword
class Demo
{
	int x,y,z;
	Demo(int x,int y,int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	Demo(int x,int y)
	{
		this(x,y,1000);
	}
	Demo(int x)
	{
		this(x,2000);
	}
	Demo()
	{
		this(3000);
	}
	public void display()
	{
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
		System.out.println("Z: "+z);
	}
}
class DemoTest1
{
	public static void main(String args[])
	{	
		Demo d1 = new Demo(5,15,25);
		d1.display();
		Demo d2 = new Demo(10,20);
		d2.display();
		Demo d3 = new Demo();
		d3.display();
	}
}