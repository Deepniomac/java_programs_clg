//Program to implement Simple Inheritance 
class Person 
{
	String Name;
	int Age;
	public void get_NameAge(String Name,int Age)
	{
		this.Name = Name;
		this.Age = Age;
	}
	void display()
	{
		System.out.println("Person NAME: "+Name);
		System.out.println("Person AGE: "+Age);
	}
}
class Student extends Person
{
	int Marks;
	float Fee;
	void get_Info(int Marks,float Fee)
	{	
		this.Marks = Marks;
		this.Fee = Fee;
	}
	void print_Info()
	{
		System.out.println("Student Marks: "+Marks);
		System.out.println("Student Fee: "+Fee);
	}
}
class SimpleInheritanceTest
{
	public static void main(String args[])
	{
		Student St = new Student();
		St.get_NameAge("ANANDA",18);
		St.get_Info(90,85000.00f);
		St.display();
		St.print_Info();
	}
}