// Ex8-a Largest and shortest word in sentence
import java.util.Scanner;

public class LargestSmallestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = scanner.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("Empty sentence");
            return;
        }

        String[] words = sentence.split("\\s+");
        String shortest = words[0];
        String largest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
            if (word.length() > largest.length()) {
                largest = word;
            }
        }

        System.out.println("Largest word: " + largest);
        System.out.println("Shortest word: " + shortest);
    }
}
