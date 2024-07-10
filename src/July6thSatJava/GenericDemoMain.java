package July6thSatJava;

public class GenericDemoMain {
    public static void main(String[] args) {

        GenericDemo<Integer, String> items = new GenericDemo<>(101, "Hello");
        System.out.println(items.item1+" & "+items.item2);

    }
}