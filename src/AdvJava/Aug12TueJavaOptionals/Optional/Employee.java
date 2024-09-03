package AdvJava.Aug12TueJavaOptionals.Optional;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Employee {
    private Integer empID;
    private String fName;
    private String lName;
    private Integer salary;
    private String company;
}

//pojo -- plain old java object - non-functional items like this including constructor, getter setter
