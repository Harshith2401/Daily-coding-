/*844. Backspace String Compare
Solved
Easy
Topics
premium lock icon
Companies
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
 

Constraints:

1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.
 

Follow up: Can you solve it in O(n) time and O(1) space? */
class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> s1 = new Stack<>();
        Stack<Character> t1 = new Stack<>();

        for(int i=0; i<s.length(); i++) 
        {
            if(s.charAt(i) != '#') 
            {
                s1.push(s.charAt(i));
            } else 
            {
                if(!s1.isEmpty()) 
                {
                    s1.pop(); 
                }
            }
        }

        for(int i=0; i<t.length(); i++) 
        { 
            if(t.charAt(i) != '#') 
            {
                t1.push(t.charAt(i));
            } else 
            {
                if(!t1.isEmpty()) 
                {
                    t1.pop();
                }
            }
        }
        return s1.equals(t1);
    }
}
//tc=o(n+m)
//sc=o(n+m)