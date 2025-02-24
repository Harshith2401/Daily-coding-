/*/Given an integer n, return the count of all numbers with unique digits, x, where <= x < 10n.

Example 1:

Input: n = 2

Output: 91

Explanation: The answer should be the total numbers in the range of s<100, excluding 11,22,33,44,55,66,77,88,99

Example 2:

Input: n=0

Output: 1

Constraints: 0 < n<=8 */

import java.util.Scanner;

public class uniquedigits{
    public static int countNumbersWithUniqueDigits(int n) {
        int count = 0;
        int limit = (int) Math.pow(10, n);
        
        for (int i = 0; i < limit; i++) {
            if (hasUniqueDigits(i)) {
                count++;
            }
        }
        
        return count;
    }
    
    private static boolean hasUniqueDigits(int num) {
        boolean[] seen = new boolean[10];
        while (num > 0) {
            int digit = num % 10;
            if (seen[digit]) {
                return false;
            }
            seen[digit] = true;
            num /= 10;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = scanner.nextInt();
        scanner.close();
        
        System.out.println(countNumbersWithUniqueDigits(n));
    }
}
