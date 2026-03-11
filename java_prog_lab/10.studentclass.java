// Program to create Student class and insert and display student details

class Student {
    int id, age;
    String name, gender, dept;
    double aggregate;

    void insertStudent(int i, String n, String g, String d, int a, double ag) {
        id = i;
        name = n;
        gender = g;
        dept = d;
        age = a;
        aggregate = ag;
    }

    void displayStudent() {
        System.out.println(id + " " + name + " " + gender + " " + dept + " " + age + " " + aggregate);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.insertStudent(1, "Rahul", "Male", "CSE", 19, 85.5);
        s.displayStudent();
    }
}