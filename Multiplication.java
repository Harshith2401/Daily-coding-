/*Qus 9: Write a program to print product of individual digits of a given number. */
import java.util.Scanner;
public class Multiplication 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        // Initialize the product to 1 (multiplicative identity)
        int product = 1;
        // Process each digit of the number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            product *= digit;        // Multiply the digit to the product
            number /= 10;            // Remove the last digit
        }
        System.out.println(product);
        scanner.close();
    }
}
//timeco,plixcity=O(n)
