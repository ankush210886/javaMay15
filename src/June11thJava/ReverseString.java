package June11thJava;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();

        int len = s1.length();

        char[] reverse = new char[len];

        for (int i = 0; i < len; i++) {
            reverse[i] = s1.charAt(len-1-i);
        }
        System.out.println(reverse);
    }
}
