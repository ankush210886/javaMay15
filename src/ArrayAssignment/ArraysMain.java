package ArrayAssignment;

import java.util.Scanner;

public class ArraysMain {
    public static void main(String[] args) {

        ArrayOps array = new ArrayOps();

        array.showArray();
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


        switch (input) {

            case 1:
                array.reverse();
                break;
            case 2:
                array.maxEle();
                break;
            case 3:
                array.minEle();
                break;
            case 4:
                array.secondMaxEle();
                break;
            case 5:
                array.secondMinEle();
                break;
            case 6:
                array.sumOfEle();
                break;
            case 7:
                array.avgEle();
                break;
            case 8:
                array.sumArrays();
                break;
            case 9:
                array.charArray();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
