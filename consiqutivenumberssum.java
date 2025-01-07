/*829. Consecutive Numbers Sum
Solved
Hard
Topics
Companies
Given an integer n, return the number of ways you can write n as the sum of consecutive positive integers.

 

Example 1:

Input: n = 5
Output: 2
Explanation: 5 = 2 + 3
Example 2:

Input: n = 9
Output: 3
Explanation: 9 = 4 + 5 = 2 + 3 + 4
Example 3:

Input: n = 15
Output: 4
Explanation: 15 = 8 + 7 = 4 + 5 + 6 = 1 + 2 + 3 + 4 + 5
 

Constraints:

1 <= n <= 109 */


class Solution {
    public int consecutiveNumbersSum(int N) {
        int result = 1;
        int sum = 0;
        int i = 1;
        
        while (sum < N){
            sum += i;
            if ((N - sum > 0) && (N - sum) % (i + 1) == 0) result++;
            i++;
        }
        
        return result;
    }
}
//x + (x + 1) + (x + 2) + (x + 3)... (x + n) = (n + 1) * x + (1+2+3+...+n)