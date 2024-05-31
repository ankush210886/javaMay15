package May25th;

public class CumulativeSum {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        while(i<=10) {
            sum = sum + i;
            System.out.print(+i+". Cumulative sum is ");
            i++;
            System.out.println(+sum);
        }
            System.out.println("Sum of 1st 10 numbers is: "+sum);

    }
}
