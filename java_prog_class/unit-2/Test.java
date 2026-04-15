//Program to implement the static variable
class Student
{
	String Name;
	int Age;
	static double Fee;
	void accept(String N,int A)
	{	
		Name = N;
		Age = A;
	}
	void acceptFee(double F)
	{
		Fee = F;
	}
	void display()
	{
		System.out.println("Name: "+Name + " Age: "+Age + " Fee: "+Fee);
	}
}
class Test
{
	public static void main(String args[])
	{
		Student S1 = new Student();
		Student S2 = new Student();
		Student S3 = new Student();
		S1.accept("ABC",23);
		S2.accept("DEF",25);
		S3.accept("GHI",27);
		S1.acceptFee(95000.00);
		S1.display();
		S2.display();
		S3.display();
	}
}