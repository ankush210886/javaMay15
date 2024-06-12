//check if the number is positive or negative

package ifElseAssignmentMay31st;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");

        float num = scanner.nextInt();

        boolean result = num%2==0;

        if (result){
            System.out.println("Number "+num+" is even");
        }

        else
        {
            System.out.println("Number "+num+" is odd");
        }
    }
}
