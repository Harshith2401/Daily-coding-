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
