package Assignment;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {

        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age>=0 && age<=12){
            System.out.println("Child (0-12)");
        }
        else if (age>=13 && age<=19) {
            System.out.println("Teenager (13-19)");
        }
        else if (age>=20 && age<=59) {
            System.out.println("Adult (20-59)");
        }
        else if (age>=60) {
            System.out.println("Senior (60 and above)");
        }
        else{
            System.out.println("Enter a valid age");
        }

    }
}
