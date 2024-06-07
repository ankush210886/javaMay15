package Jun1st;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {

        UserInfoMethods method = new UserInfoMethods();

        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String s1 = method.input(name);
        System.out.println(s1);

        System.out.println("Enter your email: ");
        String email = scanner.next();
        String s2 = method.input(name, email);
        System.out.println(s2);

        System.out.println("Enter your password: ");
        String pwd = scanner.next();
        String s3 = method.input(name, email, pwd);
        System.out.println(s3);


    }
}
