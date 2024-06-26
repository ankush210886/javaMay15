package June22ndJavaSat.Payroll;

import java.util.Scanner;

public class Employee {
    private int empId;
    private String name;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void calculatePay(){
        double pay = 25;
        System.out.println("Enter the number of hours you worked this week!");
        Scanner scan = new Scanner(System.in);
        int workHrs = scan.nextInt();
        double salary = workHrs * pay;
        System.out.println("Your salary for the week is $"+salary);
    }
}