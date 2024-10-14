/*Write a Java program to implement a class called rational number containing four 
integer fields (Sign, numerator, denominator, exponent (raised to the power of 10)). 
Provide operations for addition, subtraction and multiplication. Keep always the 
values in lowest terms (Example: 8/12, should be represented as 2/3). Write a 
private method for conversion to lowest terms. Also provide input and output 
methods. */
import java.util.Scanner;

public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) throw new IllegalArgumentException("Denominator cannot be zero");
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    private void reduce() 
    {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) 
        {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int gcd(int a, int b) 
    {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public RationalNumber add(RationalNumber other) 
    {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber subtract(RationalNumber other) 
    {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber multiply(RationalNumber other) 
    {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public void display() 
    {
        if (denominator == 1) System.out.println(numerator);
        else System.out.println(numerator + "/" + denominator);
    }

    public static RationalNumber getInput() 
    {
        Scanner sc = new Scanner(System.in);
        return new RationalNumber(sc.nextInt(), sc.nextInt());
    }

    public static void main(String[] args) 
    {
        RationalNumber r1 = RationalNumber.getInput();
        RationalNumber r2 = RationalNumber.getInput();
        r1.add(r2).display();
        r1.subtract(r2).display();
        r1.multiply(r2).display();
    }
}
