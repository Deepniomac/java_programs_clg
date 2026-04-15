//Program that includes method in a class
class Box
{
	double width,height,depth;
	double volume(){
		return (width*height*depth);
	}
}
class BoxDemo1
{
	public static void main(String args[])
	{
		Box mb1 = new Box();
		Box mb2 = new Box();
		mb1.width = 10;
		mb1.height = 20;
		mb1.depth = 15;
		mb2.width = 3;
		mb2.height = 6;
		mb2.depth = 9;
		
		System.out.println("Volumeis: "+mb1.volume());
		System.out.println("Volumeis: "+mb2.volume());
	}
}