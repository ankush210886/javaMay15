package May25th;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the country:");
        System.out.println("India, Canada, USA or UK");
        String input = sc.next();

        switch(input) {
            case "India":
                //print the capital of India
                System.out.println("The capital of India is New Delhi");
                break;

            case("Canada"):
                System.out.println("The capital of Canada is Ottawa");
                break;

            case ("USA"):
                System.out.println("The capital of USA is Washington");
                break;

            case ("UK"):
                System.out.println("The capital of UK is London");
                break;

            case ("Australia"):
                System.out.println("The capital of Australia is Caberra");
                break;

            default:
                System.out.println("Invalid Country");
        }
    }
}
