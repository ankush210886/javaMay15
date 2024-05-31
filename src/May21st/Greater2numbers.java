package May21st;

import java.util.Scanner;

public class Greater2numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int num1=scanner.nextInt();

        System.out.println("Enter number 2 :");
        int num2=scanner.nextInt();

        System.out.println("Enter number 3 :");
        int num3=scanner.nextInt();

        if (num1==num2 && num2==num3 && num1==num3) {
            System.out.println("Numbers are equal");
        }
            else if (num3>num1 && num3>num2) {
                System.out.println(num3 + " is greater than " +num1+" & "+num2);
            }
            else if (num2>num1 && num2>num3){
                System.out.println(num2+" is smaller than "+num1+" & "+num3);
            }
            else{
                System.out.println(num1+" is the greater than "+num2+" & "+num3);
            }
        }
    }
