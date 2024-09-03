package AdvJava.Aug12TueJavaOptionals.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StreamPractice {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(
                Arrays.asList(
                        Student.builder().studentId(1L).firstName("Ank").lastName("J").courses(List.of("Math","Java","Tech","CSc")).build(),
                        Student.builder().studentId(2L).firstName("Nav").lastName("B").courses(List.of("Eng","Java","Physics","Science")).build(),
                        Student.builder().studentId(3L).firstName("Div").lastName("A").courses(List.of("Social","Java","Biology","Chemistry")).build()
                )
        );
        // concat "ABC" with firstName
        //students.stream().map(student -> student.getFirstName().concat("ABC")).forEach(firstname -> System.out.println(firstname));

        //concat courseNAme with firstNAmes, so we will use flatMap to flatten the stream
        students.stream().flatMap(student -> student.getCourses().stream()).distinct().sorted((s1, s2) -> s1.compareTo(s2)*-1).forEach(course -> System.out.println(course));
        //s1.compareTo(s2) -> +ve, -ve
        //a = 5 b =11 b-a +ve (ascending order) && a = 11 b=5 b-a -ve (descending order)
        //comparator : (returns an int value)
    }
}
