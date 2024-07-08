/*Qus 7:- 
Write a Java program to find the smallest and second smallest elements of a given array. */
import java.util.Scanner;

class SmallestElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Read the elements of the array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Check if the array has at least two elements
        if (size < 2) {
            System.out.println("Array should have at least two elements");
            return;
        }

        // Initialize the smallest and second smallest elements
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Iterate through the array to find the smallest and second smallest elements
        for (int i = 0; i < size; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest; // Update second smallest
                smallest = arr[i]; // Update smallest
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i]; // Update second smallest
            }
        }

        // Check if a valid second smallest element was found
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element");
        } else {
            System.out.println("The smallest element is: " + smallest);
            System.out.println("The second smallest element is: " + secondSmallest);
        }
    }
}
