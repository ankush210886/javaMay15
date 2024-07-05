package AssignmentSahilJune27th;

import java.util.Scanner;

public class Student {
    //Attributes
    private String name;
    private int rollNumber;
    private int age;
    private String course;
    private double[] grades;

    //Methods

    //constructor to initalize the attributes
    public Student(int rollNumber, String name, String course, double[] grades, int age) {
        this.age = age;
        this.course = course;
        this.grades = grades;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    //getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    //Calculate and return the average grade of the student
    double calculateAverageGrade() {
        double avg = 0;
        for (int i = 0; i < grades.length; i++) {
            avg += grades[i];
        }
        avg = avg / grades.length;
        return avg;
    }

    //Print the student details along with the average grade
    void displayInfo(){
        System.out.println("Name of the student is: "+name);
        System.out.println("Roll number of the student is: "+rollNumber);
        System.out.println("Age of the student is: "+age);
        System.out.println("Course enrolled in: "+course);
        System.out.println("And, the average of the grades is: "+calculateAverageGrade());
    }
}
