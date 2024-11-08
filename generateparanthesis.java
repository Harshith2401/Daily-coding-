/*Generate Parentheses
Solved 
You are given an integer n. Return all well-formed parentheses strings that you can generate with n pairs of parentheses.

Example 1:

Input: n = 1

Output: ["()"]
Example 2:

Input: n = 3

Output: ["((()))","(()())","(())()","()(())","()()()"]
You may return the answer in any order.

Constraints:

1 <= n <= 7 */
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        backtrack(result, stack, 0, 0, n);
        return result;
    }
    private void backtrack(List<String> result, Stack<Character> stack, int openCount, int closeCount, int n) {
        //  If the current sequence is valid (we used all n pairs of parentheses)
        if (openCount == n && closeCount == n) {
            // Build the string from the stack
            StringBuilder sb = new StringBuilder();
            for (char c : stack) {
                sb.append(c);
            }
            result.add(sb.toString());
            return;
        }

        // If we can add an open parenthesis
        if (openCount < n) {
            stack.push('(');  // Add ( to the stack
            backtrack(result, stack, openCount + 1, closeCount, n);
            stack.pop(); // Backtrack by removing the last '('
        }

        // If we can add a close parenthesis, do so
        if (closeCount < openCount) {
            stack.push(')');  // Add ) to the stack
            backtrack(result, stack, openCount, closeCount + 1, n);
            stack.pop();  // Backtrack by removing the last ')'
        }
    }
}



