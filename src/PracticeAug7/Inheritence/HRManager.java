package PracticeAug7.Inheritence;

public class HRManager extends Employee{

    @Override
    public void work() {
        System.out.println("work method in sub class/child class.");
    }

    public void addEmployee(){
        System.out.println("Adding employee.");
    }
}
