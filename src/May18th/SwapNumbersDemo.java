package May18th;

public class SwapNumbersDemo {
    public static void main(String[] args){

        System.out.println("Current values of x and y ");

        int x=10;
        int y=20;

        System.out.println("X : "+x);
        System.out.println("Y : "+y);

        int swap;
        swap=y;
        y=x;
        x=swap;

        System.out.println("Changed values of x and y are ");

        System.out.println("X : "+x);
        System.out.println("Y : "+y);
    }
}
