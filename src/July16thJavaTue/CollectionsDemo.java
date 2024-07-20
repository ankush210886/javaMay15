package July16thJavaTue;
import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(5);
        set.add(15);
        set.add(2);
        set.add(1);
        set.add(12);

        System.out.println("Set: "+set);

        List <Integer> list = List.of(40,20,30);
        System.out.println("List: "+list);
        TreeSet<Integer> treeSet = new TreeSet<>(list);
        System.out.println("Tree set : "+treeSet);

        List<Integer> newList = new ArrayList(list);
        System.out.println("New list: "+newList);
        Collections.sort(newList);
        System.out.println("Sorted: " +newList);
        System.out.println("Max: " +Collections.max(newList));
        System.out.println("Min: " +Collections.min(newList));

        // to convert the same to unmodifiable
        Collection<Integer> unmodifiableCollection = Collections.unmodifiableCollection(list);

        list.add(100); //can not be modified
    }
}
