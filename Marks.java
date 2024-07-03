/*Qus 3: write a Java program to create marks sheet with all grades and print the overall grade as shown below and the Grading details are as follows:
Grade A+: Marks>=90
Grade A: 90>Marks>=80 Grade B+: 80>Marks>=70 Grade B: 70>Marks>=60 Grade C: 60>Marks>=35
Fail: 35>Marks


Subject	Max Marks	Obtained marks.	Grade
Maths	100	91.	A+
DBMS	100	84.	A
C language	100	74.	B+
Java	100	64.	B
Html	100	54.	C
php
Result :.	FAIL	100	34.	FAIL
Note:- Marks are dynamic input need to read from the keyboard.*/
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Subjects and their maximum marks
        String[] subjects = {"Maths", "DBMS", "C language", "Java", "Html", "PHP"};
        int maxMarks = 100;
        // Arrays to store obtained marks and grades
        int[] obtainedMarks = new int[subjects.length];
        String[] grades = new String[subjects.length];
        // Read obtained marks from the user
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks obtained in " + subjects[i] + ": ");
            obtainedMarks[i] = sc.nextInt();
            grades[i] = calculateGrade(obtainedMarks[i]);
        }
        // Print the grade sheet
        System.out.printf("%-12s %-10s %-15s %-10s%n", "Subject", "Max Marks", "Obtained Marks", "Grade");
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%-12s %-10d %-15d %-10s%n", subjects[i], maxMarks, obtainedMarks[i], grades[i]);
        }
        

        sc.close();
    }
    // Method to calculate the grade based on obtained marks
    public static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B+";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 35) {
            return "C";
        } else {
            return "FAIL";
        }
    }
}
