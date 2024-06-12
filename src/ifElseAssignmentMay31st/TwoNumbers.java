package ifElseAssignmentMay31st;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {

        System.out.println("Enter the First number:");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Enter the Second number:");
        int y=sc.nextInt();

        if(x>y){
            System.out.println(x+" is greater than "+y);
        }
        else if(x<y){
            System.out.println(x+" is smaller than "+y);
        }
        else {
            System.out.println("Both numbers are equal.");
        }
    }
}
