/*20.VALID PARANTHESIS
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false*/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();//stck creation.
        Map<Character, Character> mapping = new HashMap<>();// map creation.
        mapping.put(')', '(');// key value mapping
        mapping.put('}', '{');
        mapping.put(']', '[');

        for (char c : s.toCharArray())// here the string is changed to array 
        {
            if (mapping.containsValue(c))// all open brckets will be pushed .
            {
                stack.push(c);
            } 
            else if (mapping.containsKey(c)) //condition for closing bracketes. 
            {
                if (stack.isEmpty() || mapping.get(c) != stack.pop()) // mapping.get gives you the adjecent value.
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();// end of the loop if the stack is empty then the answer is true.   

    }
}
//TIME COMPLIXCITY=O(n)