//Program to implement the static methods
class Student
{
	String Name;
	int Age;
	static double Fee;
	void get_Data(String N,int A)
	{	
		Name = N;
		Age = A;
	}
	void display()
	{
		System.out.println("Student Name: "+Name + "\n"+ "Student Age: "+Age);
	}
	static void acceptFee(double F)
	{
		Fee = F;
	}
	static double getFee()
	{
		return Fee;
	}
}
class Test1
{
	public static void main(String args[])
	{
		Student S = new Student();
		S.get_Data("Ananda",18);
		S.acceptFee(85000.00);
		S.display();
		System.out.println("Student Fee: "+Student.getFee());
	}
}