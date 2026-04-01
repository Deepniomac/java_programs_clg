// Ex6-a this and super keyword implementation
public class ThisSuperDemo {
    public static void main(String[] args) {
        Child child = new Child("Rohan", 21, "CSE");
        child.show();
    }
}

class Parent {
    protected String name;
    protected int age;

    Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Child extends Parent {
    private String department;

    Child(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Department: " + this.department);
    }
}
