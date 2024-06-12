package PracticePrograms;
import java.util.*;

public class FloydsTriangle {
    public static void main(String[] args) {

        System.out.println("Enter the number of rows");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int counter = 0;

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= i; j++){
                counter++;
                System.out.print(counter+" ");
            }
            System.out.println();
        }
    }
}
