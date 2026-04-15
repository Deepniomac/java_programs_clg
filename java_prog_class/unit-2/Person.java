//Java Program to implement the multiple inheritance
interface Student
{
	
	void display();
}
interface Employee
{
	void printData();
}
class Person implements Student,Employee
{
	
	
	public void display()
	{
		System.out.println("this is student output");
	}
	
public void printData()
	{
		System.out.println("this is Employee output");
	}
	
}
class MutipleTest 
{
	public static void main(String args[])
	{
		
		Person p=new Person();
		p.display();
		p.printData();
	}
}
 
