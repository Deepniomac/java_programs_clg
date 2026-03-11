// Java program to take input as Decimal number and convert into Roman Number
import java.util.*;
class DeciRoman
{
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        num = sc.nextInt();
        String roman = decimalToRoman(num);
        System.out.println("Decimal: " + num + " -> Roman Numeral: " + roman);
        sc.close();
    }

    public static String decimalToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                sb.append(symbols[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }
    
}