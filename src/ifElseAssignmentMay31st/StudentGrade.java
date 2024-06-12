package ifElseAssignmentMay31st;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = sc.nextInt();

            if (score>=0 & score<60){
                System.out.println("Your grade is F");
            }
            else if (score >= 60 && score<70){
                System.out.println("Your grade is D");
            }
            else if (score >= 70 && score<80){
                System.out.println("Your grade is C");
            }
            else if (score >= 80 && score<90){
                System.out.println("Your grade is B");
            }
            else if (score >= 90 && score <=100){
                System.out.println("Your grade is A");
            }
            else{
                System.out.println("Invalid score");
            }

        }
    }
