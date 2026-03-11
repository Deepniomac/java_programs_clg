// Java program to take input as Integer array and print even indexed even numbers and odd indexed odd numbers.
import java.util.*;
class EvenOddArr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Even indexed even numbers:");// Print even indexed even numbers
        for(int i=0; i<n; i+=2)
        {
            if(arr[i] % 2 == 0)
            {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\nOdd indexed odd numbers:");// Print odd indexed odd numbers
        for(int i=1; i<n; i+=2)
        {
            if(arr[i] % 2 != 0)
            {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}