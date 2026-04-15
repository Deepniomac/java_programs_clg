/*Write a Java program to create Class as Registration with properties as Full Name(String) , 
Gender(char), Age(int),  Height(double),  Phone  Number(long),  and  isMarried(Boolean)  and 
print their values.*/
class Registration
{
	String Full_Name;
	char Gender;
	int Age;
	double Height;
	long Phone_Number;
	boolean isMarried;
	public void get_Details(String Name,char G, int A, double H, long Ph,boolean M )
	{
		Full_Name = Name;
		Gender = G;
		Age = A;
		Height = H;
		Phone_Number = Ph;
		isMarried = M;
	}
	public void print_Details()
	{
		System.out.println("Name :" +Full_Name);
		System.out.println("Gender :" +Gender);
		System.out.println("Age :" +Age);
		System.out.println("Height :" +Height);
		System.out.println("Phone_Number :" +Phone_Number);
		System.out.println("IsMarried :" +isMarried);
	}
}
class RegistrationTest
{
	public static void main (String args[]) 
	{
		Registration re = new Registration();
		re.get_Details("Ananda",'M',19,181.2,1224567885,false);
		re.print_Details();
	}
}