package May28th;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("********************");
        System.out.println("Table of Number "+num+" is:");
        System.out.println("********************");

        for (int i=1;i<=10;i++){
            System.out.println(+num+" * "+i+" = "+num*i);
        }
    }
}
