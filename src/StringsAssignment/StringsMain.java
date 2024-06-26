package StringsAssignment;
import java.util.*;

public class StringsMain {
    public static void main(String[] args) {

        StringOps obj = new StringOps();
        obj.menu();
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        switch(input){
            case 1:
                //Create a program to check if a given string is a palindrome (reads the same backward as forward).
                obj.palindrome();
                break;
            case 2:
                //Count of Vowels & Consonants in a string
                obj.vowlConsoCount();
                break;
            case 3:
                //find the length of the longest substring without repeating characters
                obj.lenOfLongestSubstring();
                break;
            case 4:
                //A sentence as input and reverses the order of words in it.
                //A word is defined as a sequence of non-space characters.
                //The program should maintain the order of characters within each word.
                obj.reverseWords();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
