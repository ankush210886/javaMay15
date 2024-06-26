package StringsPractice;

public class StringsDemo {
    public static void main(String[] args) {
        String str = "abc";
        char[] data = {'x', 'y', 'z'};
        String str1 = new String(data);

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc"+cde);
        String c = "abc".substring(2,3);
        String d = cde.substring(1, 2);
        System.out.println(c);
        System.out.println(d);

        c = "30";
        c = c + 30;
        System.out.println(c);
    }
}