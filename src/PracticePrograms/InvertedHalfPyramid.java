package PracticePrograms;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {

        System.out.println("Enter the number of rows");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();

        for (int i = 1; i<=rows; i++){
            for (int j = 1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
