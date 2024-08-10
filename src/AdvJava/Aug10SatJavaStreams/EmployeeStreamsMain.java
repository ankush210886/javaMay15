package AdvJava.Aug10SatJavaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStreamsMain {
    public static void main(String[] args) {

        EmployeeStreams employeeStreams1 = new EmployeeStreams(1, "Ank","J",1119617460,"Apple",120000);
        EmployeeStreams employeeStreams2 = new EmployeeStreams(2, "Nav","B",1119617461,"Meta",110000);
        EmployeeStreams employeeStreams3 = new EmployeeStreams(3, "Bav","S",1119617462,"Alphabet",100000);
        EmployeeStreams employeeStreams4 = new EmployeeStreams(4, "Div","A",1119617463,"Banana",125000);
        EmployeeStreams employeeStreams5 = new EmployeeStreams(5, "Pra","P",1119617464,"Apple",130000);

        List<EmployeeStreams> employeeList = new ArrayList<>();
                employeeList.add(employeeStreams1);
                employeeList.add(employeeStreams2);
                employeeList.add(employeeStreams3);
                employeeList.add(employeeStreams4);
                employeeList.add(employeeStreams5);

        Stream<EmployeeStreams> employeeStreamsStreams = employeeList.stream();

        //Operation 1
        List<EmployeeStreams> listOfEmployeesSalary = employeeList.stream()
                .filter(x -> x.getSalary() > 110000)
                .toList();
        System.out.println("Operation1:: List of Employees with salary more than 110000:\n" + listOfEmployeesSalary);

        //Operation 2
        System.out.println("\nOperation 2:: List of Employees with salary less than 125000:");
        employeeList.stream()
                .filter(s -> s.getSalary() < 125000)
                .map(e -> e.getFName())
                .forEach(f -> System.out.println(f));


        //Operation 3
        //Salary < 115000 get ID and company Name in a map
        Map<String, String> collect = employeeList.stream()
                .filter(s -> s.getSalary() < 115000)
                .collect(Collectors.toMap(id -> "Emp id: " + id.getEmpId(), c -> c.getCompany()));

        System.out.println("\nOperation 3 :: Employees information with salary less than 115000:\n" + collect);

    }
}