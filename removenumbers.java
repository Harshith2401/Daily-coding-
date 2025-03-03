/*You are given a string num representing a non-negative integer and an integer k. Your task is to remove k digits from num to form the smallest
possible integer. The result should not have any leading zeros unless it is "0".
Examples
Example 1
Input:
num = "7654321", k = 4
Output:
321
Explanation: Remove the four digits 7, 6, 5, and 4 to get the smallest possible number 321.
Example 2
Input:
num = "90876", k = 2
Output:
076 "76" (removing leading zero)
Explanation: Remove 9 and 8, leaving 076, which simplifies to 76.
Example 3
Input:
num = "99", k = 2
Output:
0
Explanation: Removing all digits leaves nothing, so the result is "0".*/

import java.util.*;

public class removenumbers {
    public static String removeKdigits(String num, int k) 
    {
        if (k >= num.length()) return "0"; //edge case.
        
        Stack<Character> stack = new Stack<>();
        
        for (char digit : num.toCharArray()) 
        {
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) 
            {
                stack.pop(); //Remove larger digits
                k--;
            }
            stack.push(digit);
        }
        
        //Remove remaining k digits only sometimes
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        
        //result
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) 
        {
            result.append(stack.pop());
        }
        result.reverse();//Reverse get correct order
        //Remove leading zeros
        while (result.length() > 1 && result.charAt(0) == '0') 
        {
            result.deleteCharAt(0);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int k = scanner.nextInt();
        scanner.close();
        System.out.println(removeKdigits(num, k));
    }
}
//TIME COMPLEXITY:O(N)