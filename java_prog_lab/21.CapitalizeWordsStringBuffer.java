// Ex8-c Capitalize first letter of each word using StringBuffer
import java.util.Scanner;

public class CapitalizeWordsStringBuffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = scanner.nextLine().trim().toLowerCase();

        if (sentence.isEmpty()) {
            System.out.println("Empty sentence");
            return;
        }

        String[] words = sentence.split("\\s+");
        StringBuffer output = new StringBuffer();

        for (String word : words) {
            output.append(Character.toUpperCase(word.charAt(0)));
            if (word.length() > 1) {
                output.append(word.substring(1));
            }
            output.append(' ');
        }

        System.out.println(output.toString().trim());
    }
}
