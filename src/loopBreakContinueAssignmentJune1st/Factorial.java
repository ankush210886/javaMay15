//Factorial of a given number

package loopBreakContinueAssignmentJune1st;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int fact = 1;

        while(num>=1){
            fact = fact * num;
            num--;
        }
        System.out.println(fact);
    }
}
