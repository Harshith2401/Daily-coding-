/*Qus 8:
Given the marks of a student in three subjects, determine if the student has passed or failed. The student passes if they score at least 40 in each subject and the average score is 50 or more.
Input:
Three space-separated integers representing the marks in three subjects.
Output:
Print "Pass" if the student passes, otherwise print "Fail".
Example:
Input:
45 55 60
Output:
Pass
 */
import java.util.Scanner;
public class Markspass 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the marks for the three subjects
        int mark1 = scanner.nextInt();
        int mark2 = scanner.nextInt();
        int mark3 = scanner.nextInt();

        // Check if the student passes
        if (mark1 >= 40 && mark2 >= 40 && mark3 >= 40) {
            int average = (mark1 + mark2 + mark3) / 3;
            if (average >= 50) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        } else {
            System.out.println("Fail");
        }

        scanner.close();
    }
}
//TIMECPMLECITY=O(1)

