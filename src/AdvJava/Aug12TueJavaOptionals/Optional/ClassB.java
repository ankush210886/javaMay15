package AdvJava.Aug12TueJavaOptionals.Optional;

import java.util.Optional;

public class ClassB {
    public Optional<Employee> retrieveEmployee(){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        Optional<Employee> employee = employeeDAO.getEmployeeById();
        return employee;
    }
}
