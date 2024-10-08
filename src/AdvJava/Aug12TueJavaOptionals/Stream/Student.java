package AdvJava.Aug12TueJavaOptionals.Stream;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Student {
    private  Long studentId;
    private String firstName;
    private String lastName;
    private List<String> courses;
}
