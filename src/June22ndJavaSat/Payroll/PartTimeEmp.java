package June22ndJavaSat.Payroll;

public class PartTimeEmp extends Employee{

    public void calculatePay(){
        System.out.println("You're a part time employee!");
        super.calculatePay();
    }
}
