import java.util.Scanner;

public class BigSmallWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String words[] = sentence.split(" ");

        String smallest = words[0];
        String biggest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }

            if (words[i].length() > biggest.length()) {
                biggest = words[i];
            }
        }

        System.out.println("Smallest word: " + smallest);
        System.out.println("Biggest word: " + biggest);
    }
}
