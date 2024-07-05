package AssignmentSahilJune27th;

public class StudentManager {
    private Student[] students;
    private int studentCount;

    public StudentManager(int size){
        students = new Student[size];
        studentCount = 0;
    }

    //Add a student to the list
    void addStudent(Student student){
        if (studentCount < students.length){
            students[studentCount++] = student;
        }
    }

    //Display information for all students
    void displayAllStudents(){
        if(studentCount == 0){
            System.out.println("No students to display.");
            return;
        }
        System.out.println("All students details are:");
        for (int i = 0; i < studentCount; i++) {
            students[i].displayInfo();
            System.out.println();
        }
    }

    //Find and return a student by their roll number
    Student findStudentByRollNo(int rollNumber) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getRollNumber() == rollNumber) {
                students[i].displayInfo();
            }else {
                System.out.println("Roll number not found.");
            }
        }
        return null;
    }


    //Remove a student from the list by their roll number
    void removeStudentsByRollNo(int rollNumber) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getRollNumber() == rollNumber) {
                students[i] = students[studentCount - 1];
                students[studentCount - 1] = null;
                studentCount--;
                System.out.println("Roll number "+rollNumber+" is removed\n\n");
                displayAllStudents();
                return;
            }
        }
        System.out.println("Roll number "+rollNumber+" not found");
        displayAllStudents();
    }

    //Display the student by their highest average grade
    void displayTopStudent(){
        if (studentCount == 0){
            System.out.println("No student info available");
            return;
        }

        Student topStudent = students[0];
        for (int i = 1; i < studentCount; i++) {
            if (students[i].calculateAverageGrade() > topStudent.calculateAverageGrade()){
                topStudent = students[i];
            }
        }
        System.out.println("Top Student with highest average grade is:");

        for (int i = 0; i < studentCount ; i++) {
            if (students[i].calculateAverageGrade() == topStudent.calculateAverageGrade()){
                students[i].displayInfo();
                System.out.println();
            }
        }
    }
}