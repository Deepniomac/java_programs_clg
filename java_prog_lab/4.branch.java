/*Write a Java program to take input as read.No and print the branch depending upon the department code 
in that recd.No using else-if and switch statements.
(Eg read. No:23KD1A0505, 8th character is department Code, 5-CSE, 4-ECE, 3-MECH, 2-EEE etc.)*/
import java.util.Scanner;
class Branch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your registration number: ");

        String regNo = sc.nextLine();
        char deptCode = regNo.charAt(7);
        switch(deptCode){
            case '5': System.out.println("CSE");
                      break;
            case '4': System.out.println("ECE");
                      break;
            case '3': System.out.println("MECH");
                      break;
            case '2': System.out.println("EEE");
                      break;
            default:  System.out.println("Invalid Department Code");
        }
        sc.close();
    }
}