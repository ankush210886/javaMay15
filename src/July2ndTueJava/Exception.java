package July2ndTueJava;

public class Exception {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try{
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
    //        e.getMessage();
            e.printStackTrace();
        }
    }
}
