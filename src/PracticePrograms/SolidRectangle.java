/* Solid Rectangle Pattern
******
******
******
******
 */
package PracticePrograms;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {

        System.out.println("Enter the number of rows");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();

        System.out.println("Enter the number of columns");
        int col = scan.nextInt();

        for (int i=1; i<=col;i++){
            for (int j=1; j<=rows;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
