//Program to initialize the box dimensions using Constructors
//Constructor Overloading
class Box
{	
	
	double width,height,depth;
	Box(){
		System.out.println("Zero argument constructor invokes");
		width = 10.0;
		height = 10.0;
		depth = 10.0;
	}
	Box(double w,double h,double d){
		System.out.println("Three argument constructor invokes");
		width = w;
		height = h;
		depth = d;
	}
	Box(double w,double h){
		System.out.println("Two argument constructor invokes");
		width = w;
		height = h;
	}
	void volume(){
		System.out.print("Volume is: ");
		System.out.println(width*height*depth);
	}
}
class BoxDemo2
{
	public static void main(String args[])
	{
		Box mb1 = new Box();
		Box mb3 = new Box(20.0,20.0,20.0);
		Box mb2 = new Box(10.0,20.0);
		mb1.volume();
		mb2.volume();
		mb3.volume();
	}
}