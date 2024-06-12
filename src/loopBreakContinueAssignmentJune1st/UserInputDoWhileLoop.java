//Create a Java program that uses a do-while loop to continuously prompt the user
// for input until they enter 'q' to quit.

package loopBreakContinueAssignmentJune1st;

import java.util.Scanner;

public class UserInputDoWhileLoop {
    public static void main(String[] args) {

        String input;

        do {
            System.out.println("Enter the input:");
            Scanner scan = new Scanner(System.in);
            input = scan.next();
            scan.nextLine();
        } while (!input.equals("q"));
    }
}
