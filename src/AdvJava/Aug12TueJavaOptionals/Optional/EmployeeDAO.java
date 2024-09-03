package AdvJava.Aug12TueJavaOptionals.Optional;

import java.util.Optional;

public class EmployeeDAO {
    public Optional<Employee> getEmployeeById(){
        // getting from Database - repository
        //use Optional
        Optional<Employee> optionalEmployee = Optional.empty();

        return optionalEmployee;
    }
}

//Data access object - DAO