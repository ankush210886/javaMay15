/* Hollow Rectangle Pattern
 *********
 *       *
 *       *
 *       *
 *********

 * */

package PracticePrograms;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {

        System.out.println("Enter the number of rows");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();

        System.out.println("Enter the number of columns");
        int col = scan.nextInt();

        for (int r = 1; r <= rows; r++) {

            for (int c = 1; c <= col; c++) {

                if (r == 1 || r == rows || c == 1 || c == col) {

                    System.out.print("* ");
                }else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}

