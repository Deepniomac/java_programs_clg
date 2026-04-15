package rajmath;
public class Admin
{
	String Name;
	int Age;
	public Admin()
	{
		Name = "Rajender";
		Age = 55;
	}
	public Admin(String Name,int Age)
	{
		this.Name = Name;
		this.Age = Age;
	}
	public void display()
	{
		System.out.println("Student Name: "+Name);
		System.out.println("Student Age: "+Age);
	}
}