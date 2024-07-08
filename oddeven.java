/*Qus 8:- 
Write a Java program to separate even and odd numbers from a given array of integers. Put all even numbers first, and then odd numbers.*/  
import java.util.Scanner;
public class oddeven{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //idhi number input
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); //array input
        }
        //main logic ikkada
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }
            while (arr[right] % 2 == 1 && left < right) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
