import java.util.*;

public class lexistring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        while (T-- > 0) {
            String P = scanner.nextLine();
            String S = scanner.nextLine();

            StringBuilder result = new StringBuilder();
            for (char c : P.toCharArray()) {
                for (char s : S.toCharArray()) {
                    if (s == c) {
                        result.append(s);
                    }
                }
            }

            System.out.println(result);
        }

        scanner.close();
    }
}