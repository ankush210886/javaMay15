package July16thJavaTue;
import java.util.*;

public class AscendDemo {
    public static void main(String[] args) {
        System.out.println("Enter the names:");
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new TreeSet<>();
        String names;

        while(true) {
            names = scanner.nextLine();
            if (names.equals("done")) {
                break;
            }
            set.add(names);
        }

        System.out.println(set);

    }
}
