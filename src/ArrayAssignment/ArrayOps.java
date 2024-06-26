package ArrayAssignment;

public class ArrayOps extends Arrays{

    void reverse(){
        //Reversing the array
        int temp = 0;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        //Printing the reversed array
        System.out.println("The reversed data is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length-1){
                System.out.print(", ");
            }
        }
    }

    void maxEle(){
        //finding the maximum number in the array
        int max = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1]){
                max = arr[i+1];
            }
        }
        System.out.println("Maximum number is "+max);
    }

    void minEle(){
        //finding the minimum number in the array
        int min = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum number is "+min);
    }

    void secondMaxEle() {
        //sorting the array in descending order and capture 1st index of the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //printing the 2nd maximum element
        System.out.println("The 2nd Maximum Element is "+arr[1]);
    }

    void secondMinEle(){
        //sorting the array in ascending order and capture 1st index of the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //printing the 2nd maximum element
        System.out.println("The 2nd Minimum Element is "+arr[1]);
    }

    void sumOfEle(){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
        }
        System.out.println("The sum of all the elements is "+sum);
    }

    void avgEle(){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
        }
        int avg = sum/arr.length;
        System.out.println("The average of all the elements is "+avg);
    }

    void sumArrays(){
        int[][] array1 = {{54,12,4}, {2,36,40},{6,4,5}};
        int[][] array2 = {{2,9,40}, {5,3,6},{3,5,12}};

        int rows, cols;
        rows = array1.length;
        cols = array1[0].length;
        int[][] array3 = new int[rows][cols];

        System.out.println("Contents of array 1 and array 2 are:");

        //printing Array1
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("   &");

        //printing Array2
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }
        //adding 2 arrays
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
            }

        }

        //printing the sum of arrays
        System.out.println("-------------------");
        System.out.println("The sum of 2 arrays");
        System.out.println("-------------------");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array3[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    //creating a char array
    void charArray(){
        char[] charArray = {'A','B','C','D'};

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }
}

