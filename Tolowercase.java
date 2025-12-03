/*Description
Accepted
Accepted
Editorial
Editorial
Solutions
Solutions
Submissions
Submissions
Code
Code
Code Sample
Testcase
Testcase
Test Result
709. To Lower Case
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 

Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"
 

Constraints:

1 <= s.length <= 100
s consists of printable ASCII characters. */

class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++) 
        {
            char c=s.charAt(i);
            if(c>='A'&&c<='Z') 
            {
                c=(char)(c+32);
            }
            sb.append(c);
        }
        return sb.toString();
    }
}

//tc=o(n)
//sc=o(n)