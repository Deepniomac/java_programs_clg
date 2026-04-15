import java.io.*;
class A
{
	A(){
		System.out.println("This is A class");
	}
}
class B
{
	B(){
		System.out.println("This is B class");
	}
}
class C
{
	C(){
		System.out.println("This is C class");
	}
}
class Firstprogram{
	public static void main(String args[]){
		A ob = new A();
		B ob1 = new B();
		C ob2 = new C();
	}
}