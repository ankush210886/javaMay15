import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("=========================");

            for(int i=0; i<3; i++) {

                String s1 = scan.next();
                int x = scan.nextInt();
                int len = s1.length();

                if (len > 15) {
                    s1 = s1.substring(0, 15);
                }
                System.out.print(s1);

                for (int j=0; j<(15-len);j++){
                    System.out.print(" ");
                }

                if(x < 10){
                    System.out.println("00" + x);
                } else if (x < 100) {
                    System.out.println("0" + x);
                } else {
                    System.out.println(x);
                }
            }
        System.out.println("=========================");
    }
}
