/*Qus 5:- A complex number is a number that can be expressed in the form a+bi,
where a
and b are real numbers, and i is a solution of equation x2=-1.
Write a program to Add and subtract two complex numbers by creating a class
Complex number in which :
• The complex numbers will be initialized with the help of the constructor.
• The addition and subtraction will be performed with the help of function
calling.
Example :
Input : a1= 4 b1=8 a2=5 b2=7
Output : Sum = 9+ i15 Difference = -1+i
 */
import java.util.Scanner;
class ComplexNumber {
    private int a;
    private int b;

    // Constructor to initialize the complex number
    public ComplexNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.a + other.a, this.b + other.b);
    }

    // Method to subtract two complex numbers
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.a - other.a, this.b - other.b);
    }

    @Override
    public String toString() {
        if (b >= 0) {
            return a + " + i" + b;
        } else {
            return a + " - i" + (-b);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        // Example input
        System.out.println("eneter the a1 value");
        int a1 = sc.nextInt();
        System.out.println("eneter the a2 value");
        int a2 =sc.nextInt();
        System.out.println("eneter the b1 value");
        int b1=sc.nextInt();
        System.out.println("eneter the b2 value");
        int b2=sc.nextInt();

        // Create two complex number objects
        ComplexNumber num1 = new ComplexNumber(a1, b1);
        ComplexNumber num2 = new ComplexNumber(a2, b2);

        // Perform addition and subtraction
        ComplexNumber sum = num1.add(num2);
        ComplexNumber difference = num1.subtract(num2);

        // Print the results
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
    }
}