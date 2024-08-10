package PracticeAug7FunctionalInterface.Inheritence;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee = new Employee(40000);
        HRManager hrManager = new HRManager(70000);

        employee.work();
        employee.getSalary();
        System.out.println("Employee salary: " + employee.getSalary());
        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("Manager Salary: "+ hrManager.getSalary());
        hrManager.work();
        hrManager.addEmployee();
    }
}
