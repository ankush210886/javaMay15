package June22ndJavaSat.Payroll;

public class FullTimeEmp extends Employee {

    public void calculatePay(){
        System.out.println("You're a full time employee!");
        super.calculatePay();
    }


}