package AdvJava.Aug12TueJavaOptionals.Optional;

import java.util.Optional;

public class ClassA {
    public Employee methodA(){
        ClassB b = new ClassB();
        Optional<Employee> optionalEmployee = b.retrieveEmployee();

        return optionalEmployee.orElseGet(() -> Employee.builder().fName("A").lName("J").empID(1).salary(150000).company("ABC INC.").build());

//        if (optionalEmployee.isPresent()){
//            Employee employee = optionalEmployee.get();
//            System.out.println(employee.getfName());
//        }
    }
}
