// Java program to read input integers manually and print first and second largest numbers
import java.util.Scanner;
class LargestNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();

        if(n < 2){
            System.out.println("At least 2 numbers are required.");
            sc.close();
            return;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        System.out.println("Enter the integers:");
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(num > firstLargest){
                secondLargest = firstLargest;
                firstLargest = num;
            }
            else if(num > secondLargest && num != firstLargest) secondLargest = num;
        }

        System.out.println("The First Largest number is: " + firstLargest);
        System.out.println("The Second Largest number is: " + secondLargest);
        sc.close();
    }
}