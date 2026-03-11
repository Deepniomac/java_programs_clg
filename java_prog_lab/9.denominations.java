// Java program to take input as Amount in rupees and print their denominations and total number notes
import java.util.*;
class Denominations{
    public static void main(String[] args)
    {
        int amount, count,totalNotes = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in rupees: ");
        amount = sc.nextInt();
        int[] denominations = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        System.out.println("Denominations:");
        for (int i = 0; i < denominations.length; i++)
        {
            if (amount >= denominations[i])
            {
                count = amount / denominations[i];
                totalNotes += count;
                amount = amount % denominations[i];
                System.out.println(denominations[i] + " x " + count);
            }
        }
        System.out.println("Total number of notes: " + totalNotes);
        sc.close();
    }
}