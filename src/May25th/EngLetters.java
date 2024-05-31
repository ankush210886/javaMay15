package May25th;

import java.util.Scanner;

public class EngLetters {
    public static void main(String[] args) {
        System.out.println("Enter the letter between A-Z:");
        Scanner sc = new Scanner(System.in);

        char l = sc.next().charAt(0);

        if (l == 'A' || l == 'a' || l == 'E' || l == 'e' || l == 'I' || l == 'i' || l == 'O' || l == 'o' || l == 'U' || l == 'u') {
            System.out.println("The Letter is a Vowel.");

        } else {
            System.out.println("The letter is a Consonant.");
        }
    }
}

