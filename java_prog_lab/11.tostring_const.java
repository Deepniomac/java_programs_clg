// Program to insert student details using constructor and print using toString
class Student {
    int id, age;
    String name, gender, dept;
    double aggregate;
    Student(int i, String n, String g, String d, int a, double ag) {
        id = i;
        name = n;
        gender = g;
        dept = d;
        age = a;
        aggregate = ag;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + dept + " " + age + " " + aggregate;
    }
    public static void main(String[] args) {
        Student s = new Student(1, "Ravi", "Male", "CSE", 20, 88.5);
        System.out.println(s);
    }
}