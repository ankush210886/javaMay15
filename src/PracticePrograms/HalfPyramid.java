package PracticePrograms;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {

        System.out.println("Enter the number of rows");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();

        for (int r = 1; r <= rows; r++){

            for (int j = 1; j <= r; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
