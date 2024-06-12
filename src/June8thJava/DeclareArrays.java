//Another method of declaring arrays

package June8thJava;

import java.util.Scanner;

public class DeclareArrays {
    public static void main(String[] args) {

        //int[] arr = {101,102,103,104,105};

        System.out.println("Enter the size of Array you want to create:");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] rollNums = new int[n];

        System.out.println("Enter the elements of Array");

        for (int i = 0; i < rollNums.length; i++) {
            rollNums[i] = scan.nextInt();
        }

        System.out.println("Enter the names");

        String[] StuName = new String[n];

        for(int i = 0; i<StuName.length; i++) {
            StuName[i] = scan.next();
        }

        for (int i = 0; i < rollNums.length; i++) {
            System.out.println("Roll Number "+rollNums[i]);
        }
        for (int j = 0; j<StuName.length; j++){
            System.out.println("Name "+StuName[j]);
        }
    }
}

        /*   rollNums[0] = 201;
        rollNums[1] = 202;
        rollNums[2] = 203;
        rollNums[3] = 204;
        rollNums[4] = 205;


        System.out.println("Roll Number "+rollNums[0]);
        System.out.println("Roll Number "+rollNums[1]);
        System.out.println("Roll Number "+rollNums[2]);
        System.out.println("Roll Number "+rollNums[3]);
        System.out.println("Roll Number "+rollNums[4]);
       */
