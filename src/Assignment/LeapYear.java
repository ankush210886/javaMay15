package Assignment;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        System.out.print("Enter the Year to check if it is a leap year or not? ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year > 0){
            int rem=year % 4;
            if (rem==0){
                System.out.println("The Year "+year+" is a leap year.");
            }
            else{
                System.out.println("The Year "+year+" is not a leap year.");
            }
        }
        else{
            System.out.println("Enter a valid Year.");
        }
    }
}
