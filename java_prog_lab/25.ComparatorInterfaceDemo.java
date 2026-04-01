// Ex9-d Comparator interface implementation
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(103, "Nikhil", 62000));
        employees.add(new Employee(101, "Anita", 58000));
        employees.add(new Employee(102, "Rahul", 74000));

        Collections.sort(employees, new SalaryComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

class Employee {
    private int id;
    private String name;
    private int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getSalary(), e2.getSalary());
    }
}
