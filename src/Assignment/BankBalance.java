package Assignment;

import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {

        System.out.print("Enter your Bank Balance Amount: ");
        Scanner sc = new Scanner(System.in);
        double bal = sc.nextDouble();

        if (bal<0){
            System.out.println("The account is in Overdraft.");
        }
        else if (bal>=0 && bal<=100) {
            System.out.println("The account balance is low.");
        }
        else{
            System.out.println("The account has a healthy balance.");
        }

    }
}
