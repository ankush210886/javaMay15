package June22ndJavaSat.Payroll;
import java.util.*;

public class EmpMain {
    public static void main(String[] args) {

        System.out.println("Enter the Emp Id:");
        Scanner scan = new Scanner(System.in);
        int empId = scan.nextInt();
        System.out.println("Enter your name:");
        String name = scan.next();

        FullTimeEmp fullTimeEmp = new FullTimeEmp();
        PartTimeEmp partTimeEmp = new PartTimeEmp();
        Employee emp = new Employee();

        emp.setEmpId(empId);
        emp.setName(name);

        System.out.println("If you're a full time employee, Press 1");
        System.out.println("But if you're a part time employee, Press 2");
        int input = scan.nextInt();

        switch(input){
            case 1:{
                fullTimeEmp.calculatePay();
                break;
            }
            case 2:{
                partTimeEmp.calculatePay();
                break;
            }
            default:
                System.out.println("Invalid Choice");
        }
    }
}
