// super keyword To refer the property of immediate super class.

class Person 
{
	String name;
	int age;
	
	void display()
	{
		System.out.println("Employee name = "+ name);
		System.out.println("Employee age = "+ age);
	}
}

class Employee extends Person
{
	String designation;
	double sal;
	
	void getData(String name, int age, String designation, double sal)
	{
		super.name = name;
		super.age = age;
		this.designation = designation;
		this.sal = sal;
	}
	
	void putData()
	{
		super.display();
		System.out.println("Employee designation = "+ designation);
		System.out.println("Employee salary = "+ sal);
	}
}

class SuperTest
{
	public static void main(String args [])
	{
		Employee e = new Employee();
		e.getData("Sreeraj", 19, "Student", 100000.65);
		e.putData();
		
	}
}