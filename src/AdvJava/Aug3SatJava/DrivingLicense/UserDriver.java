package AdvJava.Aug3SatJava.DrivingLicense;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class UserDriver {
    private String fName;
    private String lName;
    private int age;
    private String province;
}
