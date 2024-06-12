package PracticePrograms;
import java.util.*;

public class ZeroOneTriangle {
        public static void main(String[] args) {

        System.out.println("Enter the number of rows");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print(1+" ");
                }
                else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
