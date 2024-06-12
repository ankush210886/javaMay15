package PracticePrograms;
import java.util.*;

public class InvertedHalfNumberPyramid {
    public static void main(String[] args) {

        System.out.println("Enter the number of rows");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();

        for (int i = rows; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
