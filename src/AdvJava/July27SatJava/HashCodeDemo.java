package AdvJava.July27SatJava;

public class HashCodeDemo {
    public static void main(String[] args) {

        //Map<StudentHashCodeDemo, String> attd = new HashMap<>();

        StudentHashCodeDemo student1 = new StudentHashCodeDemo(1, "Ankush", "J", "111-111-1111");
        StudentHashCodeDemo student2 = new StudentHashCodeDemo(1, "Ankush", "J", "111-111-1111");

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        //Despite data being the same, hash codes are displaying different because we didnt override the hashcode method

        System.out.println(student1.equals(new StudentHashCodeDemo(1, "Ankush", "J", "111-111-1111")));


    }
}
