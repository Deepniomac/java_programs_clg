//program to convert firstleter into captial
import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                result += Character.toUpperCase(word.charAt(0)) 
                        + word.substring(1) + " ";
            }
        }

        System.out.println("Output: " + result.trim());
}
    }