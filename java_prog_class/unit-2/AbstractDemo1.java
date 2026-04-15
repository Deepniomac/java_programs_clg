//Abstract class
abstract class Figure
{
	double dim1,dim2;
	Figure(double a,double b)
	{
		dim1 = a;
		dim2 = b;
	}
	abstract double area();
}
class Rectangle extends Figure
{
	Rectangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Inside the area of rectangle......");
		return dim1*dim2;
	}
}
class Triangle extends Figure
{
	Triangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("Inside the area of triangle......");
		return 0.5*dim1*dim2;
	}
}
class AbstractDemo1
{
	public static void main(String args[])
	{
		Rectangle rc = new Rectangle(25,12);
		Triangle tr = new Triangle(10,20);
		Figure fr;
		fr = rc;
		System.out.println("The Area of Rectangle is: "+rc.area());
		fr = tr;
		System.out.println("The Area of Triangle is: "+tr.area());
		
	}
}