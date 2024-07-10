package July9JavaTues;

import AssignmentSahilJune27th.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeListMain {
    public static void main(String[] args) {

        EmployeeList employee1 = new EmployeeList("Vaughan", "ankush@gmail.com","Ankush", 101, "J", 30);
        EmployeeList employee2 = new EmployeeList("Toronto", "div@gmail.com","Divyesh", 102, "S", 25);
        EmployeeList employee3 = new EmployeeList("Brampton", "nav@gmail.com","Navjot", 103, "S", 20);
        EmployeeList employee4 = new EmployeeList("Markham", "surinder@gmail.com","Surinder", 104, "S", 25);
        EmployeeList employee5 = new EmployeeList("Mississauga", "sukhi@gmail.com","Sukhi", 105, "S", 30);

        List<EmployeeList> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);

        System.out.println(list);

        for (EmployeeList i : list){
            if (i.getfName().equals("Ankush") || i.getAge() >=20){
                //System.out.println(i.getfName());
                System.out.println(i.getfName()+" & "+i.getAge());
            }
        }
    }
}

