//Java Program to read and print the student details using constructor
class Student
{
	String Name;
	int Age;
	String Regd_no;
	long phone_no;
	Student(String N,int A,String R,long Phn)
	{	
		Name = N;
		Age = A;
		Regd_no = R;
		phone_no = Phn;
	}
	public void display()
	{	
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Regd no: "+Regd_no);
		System.out.println("Phone number: "+phone_no);
	}
}
class StudentTest
{
	public static void main(String args[])
	{
		Student sob = new Student("Ananda Meher",18,"24KD1A1554",7382741443L);
		sob.display();
	}
}