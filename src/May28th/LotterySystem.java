package May28th;

import java.util.Scanner;

public class LotterySystem {
    public static void main(String[] args) {
        int i = 0;

        System.out.print("Enter a number between 1-100: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (i = 0; i < 3; i++) {

            int luckyNum = 55;
            if (num == luckyNum){
                System.out.println("Congratulations, you have won the lottery.");
                break;
            }
            else{
                System.out.println("Hard luck, try again.");

            }
        }
        System.out.println("Chances over!");

    }
}
