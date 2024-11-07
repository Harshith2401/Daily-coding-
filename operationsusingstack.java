/*Evaluate Reverse Polish Notation
Solved 
You are given an array of strings tokens that represents a valid arithmetic expression in Reverse Polish Notation.

Return the integer that represents the evaluation of the expression.

The operands may be integers or the results of other operations.
The operators include '+', '-', '*', and '/'.
Assume that division between integers always truncates toward zero.
Example 1:

Input: tokens = ["1","2","+","3","*","4","-"]

Output: 5

Explanation: ((1 + 2) * 3) - 4 = 5
Constraints:

1 <= tokens.length <= 1000.
tokens[i] is "+", "-", "*", or "/", or a string representing an integer in the range [-100, 100].
 */
class Solution{
    public int evalRPN(String[] tokens){
        Stack<Integer>stack=new Stack<>();
        int num1,num2,res=0;
        for(String token:tokens){
            if(isNum(token))stack.push(Integer.parseInt(token));
            else{
                num2=stack.pop();
                num1=stack.pop();
                if(token.equals("+"))res=num1+num2;
                else if(token.equals("-"))res=num1-num2;
                else if(token.equals("*"))res=num1*num2;
                else if(token.equals("/"))res=num1/num2;
                stack.push(res);
            }
        }
        return stack.pop();
    }

    private boolean isNum(String token){
        try{
            Integer.parseInt(token);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
