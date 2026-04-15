//program for this 
class Demo
{
	int x,y;
	Demo(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	public void display(){
	System.out.println("X: "+x);
	System.out.println("Y: "+y);
	}
}
class DemoTest
{
	public static void main(String args[])
	{
		Demo d = new Demo(10,20);
		d.display();
	}
}