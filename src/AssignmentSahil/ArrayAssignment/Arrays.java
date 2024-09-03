package AssignmentSahil.ArrayAssignment;

public class Arrays {

    int[] arr = {10,30,43,54,23,543,43,32};

    void showArray(){
        System.out.println("Original data is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i< arr.length-1) {
                System.out.print(" ,");
            }
        }
    System.out.println("\n");
    System.out.println("What do you want to do with the data");
    System.out.println("1. Reverse the array?");
    System.out.println("2. Find the maximum element?");
    System.out.println("3. Find the minimum array?");
    System.out.println("4. Find the second maximum?");
    System.out.println("5. Find the second minimum?");
    System.out.println("6. Find the sum of all the elements in array?");
    System.out.println("7. Find average of all elements in the array");
    System.out.println("8. Add 2D arrays");
    System.out.println("9. Printing a char Array");

    System.out.println("Enter your choice:");
    }
}
