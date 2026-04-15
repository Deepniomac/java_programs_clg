//Write a Java program to read data from Employee file and print highest salary employee information. (Employee File Contains: ID, name, Dept, Salary).

import java.io.*;
class emp_high_sal {
    public static void main(String[] args) {
        String filePath = "Employee.csv"; // Path to the employee file
        String line;
        String highestSalaryEmployee = "";
        double highestSalary = 0.0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                try {
                    String[] employeeData = line.split(","); // Assuming data is separated by commas
                    if (employeeData.length == 4) {
                        String id = employeeData[0].trim();
                        String name = employeeData[1].trim();
                        String dept = employeeData[2].trim();
                        
                        if (employeeData[3].trim().isEmpty()) {
                            System.out.println("Warning: Empty salary field for employee ID: " + id);
                            continue;
                        }
                        
                        double salary = Double.parseDouble(employeeData[3].trim());

                        if (salary > highestSalary) {
                            highestSalary = salary;
                            highestSalaryEmployee = "ID: " + id + ", Name: " + name + ", Dept: " + dept + ", Salary: " + salary;
                        }
                    } else {
                        System.out.println("Warning: Invalid record format - " + line);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Warning: Invalid salary value in line - " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        
        System.out.println("Highest Salary Employee:");
        System.out.println(highestSalaryEmployee);
    }
}