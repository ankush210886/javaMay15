package June8thJava;
import java.util.Scanner;

public class MaxMinElementInArray {
    public static void main(String[] args) {

        System.out.println("Enetr the size of array");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        showArray(arr);
    }

    public static void showArray(int[] arr){
        int max = arr[0], min = arr[0];
        for (int i = 0; i<arr.length ; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]){
                min = arr[i];
            }

        }
        System.out.println("Max is "+max);
        System.out.println("Min is "+min);
        }
    }

