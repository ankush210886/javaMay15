package PracticeAug7.Inheritence;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee = new Employee();
        HRManager hrManager = new HRManager();

        employee.work();
        employee.getSalary();
        System.out.println("**************************");
        System.out.println("**************************");
        hrManager.work();
        hrManager.addEmployee();
    }
}
