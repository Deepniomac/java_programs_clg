// Ex8-b Remove consecutive repeated characters in string
import java.util.Scanner;

public class RemoveConsecutiveRepeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("");
            return;
        }

        StringBuilder result = new StringBuilder();
        result.append(input.charAt(0));

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i - 1)) {
                result.append(input.charAt(i));
            }
        }

        System.out.println("Output: " + result);
    }
}
