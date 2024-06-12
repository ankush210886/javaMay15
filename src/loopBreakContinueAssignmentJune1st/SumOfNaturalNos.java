// Sum of first 10 natural nos

package loopBreakContinueAssignmentJune1st;

public class SumOfNaturalNos {
    public static void main(String[] args) {

        int counter = 1, sum = 0;

        while(counter <=10){
            sum = sum + counter;
  //          System.out.println(sum);
            counter++;
        }
        System.out.println(sum);

    }
}
