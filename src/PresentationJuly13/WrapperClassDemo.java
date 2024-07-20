package PresentationJuly13;

import static java.lang.Integer.parseInt;

public class WrapperClassDemo {
    public static void main(String[] args) {
        String str = "123";

        int num = new Integer(str);
        int num1 = Integer.parseInt(str);
// one of the features to convert string to an integer
        System.out.println(num1);
    }
}
