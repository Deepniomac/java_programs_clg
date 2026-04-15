import java.util.*;
public class RemoveConsecutiveChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String result = "";

        // Add first character
        result = result + str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            // Check if current char is different from previous char
            if (str.charAt(i) != str.charAt(i - 1)) {
                result = result + str.charAt(i);
            }
        }

        System.out.println("String after removing consecutive repeated characters:");
        System.out.println(result);
    }
}