package StringsAssignment;
import java.util.*;

public class StringOps extends StringArray {

    void palindrome(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string to check if it's Palindrome or not!");
        String str = scanner.nextLine();
        String rev = "";
        int len = str.length();

        for (int i = 0; i < len ; i++) {
            rev = rev + str.charAt(len-1-i);
        }
//        char[] arr1 = new char[str1.length()];
/*        char[] arr2 = new char[arr1.length];

        //stored the contents of the string in the char array
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = str1.charAt(i);
        }

        //reversed and stored the content in a new char array
        for (int i = arr2.length-1, j = 0; i >= 0 ; i--, j++) {
            arr2[i] = arr1[j];
        }

        String str2 = new String(arr2);
 */       boolean isPalindrome = false;

        System.out.println(rev);
        String newStr = str.toLowerCase().replaceAll(" ","");
        String newRev = rev.toLowerCase().replaceAll(" ","");

        if (newStr.equals(newRev)){
            isPalindrome = true;
            System.out.println("Yes, the input string is a palindrome!");
        }else {
            System.out.println("No, the input string is NOT a palindrome!");
        }
    }
    void vowlConsoCount(){
        System.out.println("Enter the string:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int counter = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
             counter++;
            }
        }
        System.out.println("The number of vowels in the input are = "+counter);
        System.out.println("The number of consonants in the input are = "+(str.length()-counter));

    }
    void lenOfLongestSubstring(){
        System.out.println("Enter the string:");
//        Scanner scan = new Scanner(System.in);
        String str; //= scan.nextLine();

        str = "hello world";
        System.out.println(str.replaceAll("/s", ""));
        str = str.substring(2);
        System.out.println(str);
    }
    void reverseWords(){}
}
