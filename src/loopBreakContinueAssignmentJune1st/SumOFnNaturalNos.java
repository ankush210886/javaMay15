package loopBreakContinueAssignmentJune1st;

import java.util.Scanner;

public class SumOFnNaturalNos {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int counter = 1, sum = 0;

        do {
            sum = sum + counter;
        //    System.out.println(sum);
            counter++;

        }while(counter<=num);
        System.out.println(sum);
    }
}
