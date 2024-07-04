/*Qus 7: Write a simple calculator program that performs addition, subtraction, multiplication, or division based on user input.
Input:
The first line consists of two integers.
The second line consists of a character representing the operation (+, -, *, /).
Output:
Print the result of the operation.
Example:
Input:
8 4
*
Output:
32*/
import java.util.Scanner;
class Claculator
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // Read the first line of input
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Read the second line of input
        char operation = sc.next().charAt(0);
        // Perform the operation
        int result;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation");
                return;
            }

        // Print the result
        System.out.println(result);
    }
}