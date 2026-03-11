/* Java program to check whether given number is Extension number. The extension number is the number which is present in the last digit(s) of its square.
(Eg.N=25, 625 is Extension number since it contains 25) */
import java.util.*;
class Extension{
    public static void main(String[] args) {
        int num,sqnum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        sqnum = num * num;

        String s1 = Integer.toString(num);
        String s2 = Integer.toString(sqnum);

        String s3 = s2.substring(s2.length() - s1.length());
        if(s1.equals(s3))
            System.out.println(num + " is an Extension number.");
        else
            System.out.println(num + " is not an Extension number.");
        sc.close();
    }
}