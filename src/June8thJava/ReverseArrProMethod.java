// Reverse the contents of an array inside the array

package June8thJava;

public class ReverseArrProMethod {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};

        for (int i = 0, j = a.length-1; i<a.length/2; i++, j--){
            int temp;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        for (int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }


    }
}
