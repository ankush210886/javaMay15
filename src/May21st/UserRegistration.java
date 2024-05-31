package May21st;

import java.util.Scanner;

public class UserRegistration{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Name : ");
        String firstName = sc.next();

        System.out.println("Enter the Last Name : ");
        String lastName = sc.next();

        System.out.println("Enter the Email : ");
        String email = sc.next();

        System.out.println("Enter the Phone : ");
        String phone = sc.next();

        System.out.println("Enter the Address : ");
        String address = sc.next();

        System.out.println("Enter the Salary : ");
        float salary = sc.nextFloat();

        System.out.println("User Registration");
        System.out.println("Enter the First Name : "+firstName);
        System.out.println("Enter the Last Name : "+lastName);
        System.out.println("Enter the Email : "+email);
        System.out.println("Enter the Phone : "+phone);
        System.out.println("Enter the Address : "+address);
        System.out.println("Enter the Salary : "+salary);

    }
}
