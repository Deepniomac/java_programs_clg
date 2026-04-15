//Runtime Polymorphism
class Person
{
	String Name;
	int Age;
	void accept()
	{
		
	}
	void display()
	{
		
	}
}
class Student extends Person
{
	int Marks;
	float Fee;
	public void accept()
	{
		super.Name = "Ananda";
		super.Age = 18;
		this.Marks = 85;
		this.Fee = 90000.00f;
	}
	public void display()
	{
		System.out.println("Student Name: "+Name);
		System.out.println("Student Age: "+Age);
		System.out.println("Student Marks: "+Marks);
		System.out.println("Student Fee: "+Fee);
	}
}
class Employee extends Person
{
	int Salary;
	String designation;
	public void accept()
	{
		super.Name = "Apparao";
		super.Age = 45;
		this.Salary = 72000;
		this.designation = "Prof";
	}
	public void display()
	{
		System.out.println("Employee Name: "+Name);
		System.out.println("Employee Age: "+Age);
		System.out.println("Employee Salary: "+Salary);
		System.out.println("Employee Designation: "+designation);
	}
}
class RunpolyTest
{
	public static void main(String args[])
	{
		Person p;
		if(args.length>=1)
			p = new Student();
		else
			p = new Employee();
		p.accept();
		p.display();
	}
}