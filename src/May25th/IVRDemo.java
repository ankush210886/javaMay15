package May25th;

import java.util.Scanner;

public class IVRDemo {
    public static void main(String[] args) {

        System.out.println("*****Welcome to the Demo Customer Care*****");

        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for English OR 2 for French");
        int input = sc.nextInt();
        String msg = (input==1) ? "English is set as your preffered language" : "French is set as your preffered language";
        System.out.println(msg);

        System.out.println("To proceed, Enter your choice : ");
        System.out.println("************************************");
        System.out.println("Press 1 to know Outstanding Balance");
        System.out.println("Press 2 to know Last bill paid");
        System.out.println("Press 3 to speak to Customer Service Team");
        System.out.println("************************************");
        System.out.print("Your Choice: ");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Your outstanding balance is $70");
                break;

            case 2:
                System.out.println("Last bill paid is $65");
                break;

            case 3:
                System.out.print("Enter the time (use 24 hr format): ");
                int time = sc.nextInt();
                if (time>8 && time<=20){
                    System.out.println("A team member will be with you shortly!");
                }

                else{
                    System.out.println("Customer service team not available. Try again between 8:00 - 20:00");
                }
        }
    }
}
