package AssignmentSahilJune27th;
import java.util.*;

public class StudentMain {
    public static void main(String[] args) {

        System.out.println("Welcome to the Student Management Portal");
        System.out.println();

        System.out.println("How many students do you want to have in the class:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        StudentManager manager = new StudentManager(size);
        
        if(size == 0){
            System.out.println("The class is empty.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the details of the student" + (i + 1) + " :");
            System.out.println("Enter the roll number:");
            int rollNumber = scan.nextInt();

            System.out.println("Enter the name");
            String name = scan.next();
            scan.nextLine();

            System.out.println("Enter the course name");
            String course = scan.next();
            scan.nextLine();

            System.out.println("Enter the grades of the 5 subjects:");
            final int subjects = 5;
            int noOfGrades = subjects;
            double[] grades = new double[noOfGrades];
            for (int j = 0; j < subjects; j++) {
                System.out.println("Grade "+(j+1)+": ");
                grades[j] = scan.nextDouble();
            }
            scan.nextLine();

            System.out.println("Enter the age");
            int age = scan.nextInt();
            System.out.println("-------------------------------------");

            Student student = new Student(rollNumber, name, course, grades, age);
            manager.addStudent(student);
        }

        boolean exit = false;
        while(!exit) {
            System.out.println("Enter your choice");
            System.out.println("1. Display All Students:");
            System.out.println("2. Search for a student by roll number:");
            System.out.println("3. Remove a student by roll number:");
            System.out.println("4. Display the top student with the highest average grade:");
            System.out.println("5. Exit");

            int input = scan.nextInt();
            switch (input) {
                case 1:
                    manager.displayAllStudents();
                    break;
                case 2:
                    System.out.println("Enter the roll number you want to find:");
                    int rollNumToFind = scan.nextInt();
                    manager.findStudentByRollNo(rollNumToFind);
                    break;
                case 3:
                    System.out.println("Enter the roll number you to remove:");
                    int rollNumToRemove = scan.nextInt();
                    manager.removeStudentsByRollNo(rollNumToRemove);
                    break;
                case 4:
                    manager.displayAllStudents();
                    manager.displayTopStudent();
                    break;
                case 5:
                    System.out.println("Exiting.....");
                    exit = true;
                    return;
                default:
                    System.out.println("Invalid Number!!!");
            }
        }
        scan.close();
    }
}
