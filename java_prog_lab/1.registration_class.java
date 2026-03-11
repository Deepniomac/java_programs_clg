/* Write a Java program to create Class as Registration with properties as Full Name(String) ,
Gender(char), Age(int), Height(double), Phone Number(long), and isMarried(Boolean) and
print their values. */

class Registration{

    String full_name;
    char Gender;
    int Age;
    double Height;
    long Phone_number;
    boolean isMarried;

    public void AssignData(String name,char gen,int age,double ht,long phone,boolean marry){
        full_name = name;
        Gender = gen;
        Age = age;
        Height = ht;
        Phone_number = phone;
        isMarried = marry;
    }

    public void PrintData(){
        System.out.println("Name : "+ full_name);
        System.out.println("Gender : "+ Gender);
        System.out.println("Age : "+ Age);
        System.out.println("Height : "+ Height);
        System.out.println("Phone Number : "+ Phone_number);
        System.out.println("Marital Status : "+ isMarried);
    }
}

class RegistrationTest{
        public static void main(String args[]){
        Registration re = new Registration();
        re.AssignData("Deepesh", 'M', 19, 160.0, 9876543210L, false);
        re.PrintData();
    }
}