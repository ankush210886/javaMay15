package May18th;

public class SwapNumbersWithoutThirdVariable {
    public static void main(String[] args){

        System.out.println("Current values of x and y ");

        int x=20;
        int y=10;

        System.out.println("X : "+x);
        System.out.println("Y : "+y);

        /*
        x=x+y;
        y=x-y;
        x=x-y;
        */

        x=x+y - (y=x);

        System.out.println("Changed values of x and y are ");

        System.out.println("X : "+x);
        System.out.println("Y : "+y);
    }
}
