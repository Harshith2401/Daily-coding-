/*Qus :-9

Write a Java program to find the maximum product of two integers in a given array of integers. */ 

import java.util.Scanner;
public class MaxProductO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // Initialize max1 and max2 with the first two elements
        int max1, max2;
        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }

        for (int i = 2; i < n; i++) {
            int num = arr[i];
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        System.out.println(max1*max2);
        scanner.close();
    }
}
}
