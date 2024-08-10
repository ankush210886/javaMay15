package PracticeAug7FunctionalInterface.Inheritence;

public class HRManager extends Employee{

    public HRManager(int salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("work method in sub class/child class.");
    }

    public void addEmployee(){
        System.out.println("Adding employee.");
    }
}
