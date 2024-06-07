package PracticePrograms;

import java.util.Scanner;

public class SumOfNaturalNos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = scan.nextInt();
        int sum = 0, counter=0;

        for (int i=1; i<=n; i++){

            System.out.println(counter + i);
            sum += i;
        }

        System.out.println("Sum of "+n+" numbers is "+sum);
    }
}
