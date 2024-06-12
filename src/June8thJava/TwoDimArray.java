package June8thJava;

import java.util.Scanner;

public class TwoDimArray {
    public static void main(String[] args) {

        System.out.println("Enter the rows of the array");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();

        System.out.println("Enter the columns of the array");
        int cols = scan.nextInt();

        int[][] arr1 = new int[rows][cols];
        int[][] arr2 = new int[rows][cols];
        int[][] arr3 = new int[rows][cols];

        System.out.println("Enter the elements of the array 1");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter the elements of the array 2");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2[i][j] = scan.nextInt();
            }
        }

        System.out.println("Array 1 is \n");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr1[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("Array 2 is \n");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr2[i][j]+"  ");
            }
            System.out.println();
        }


        System.out.println("The sum of array 1 & array 2 is\n");

        for (int i = 0; i < rows; i++) {
            for(int j = 0; j<cols; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for(int j = 0; j<cols; j++){
                System.out.print(arr3[i][j]+"  ");
            }
            System.out.println();
        }


/*
        arr1[0][0] = 10;
        arr1[0][1] = 20;
        arr1[0][2] = 30;
        arr1[1][0] = 40;
        arr1[1][1] = 50;
        arr1[1][2] = 60;
        arr1[2][0] = 70;
        arr1[2][1] = 80;
        arr1[2][2] = 90;

        arr2[0][0] = 10;
        arr2[0][1] = 20;
        arr2[0][2] = 30;
        arr2[1][0] = 40;
        arr2[1][1] = 50;
        arr2[1][2] = 60;
        arr2[2][0] = 70;
        arr2[2][1] = 80;
        arr2[2][2] = 90;

        arr3[0][0] = arr1[0][0] + arr2[0][0];
        arr3[0][1] = arr1[0][1] + arr2[0][1];
        arr3[0][2] = arr1[0][2] + arr2[0][2];
        arr3[1][0] = arr1[1][0] + arr2[1][0];
        arr3[1][1] = arr1[1][1] + arr2[1][1];
        arr3[1][2] = arr1[1][2] + arr2[1][2];
        arr3[2][0] = arr1[2][0] + arr2[2][0];
        arr3[2][1] = arr1[2][1] + arr2[2][1];
        arr3[2][2] = arr1[2][2] + arr2[2][2];
*/


    }
}
