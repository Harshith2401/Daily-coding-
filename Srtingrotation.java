/*796. Rotate String
Solved
Easy
Topics
premium lock icon
Companies
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false
 

Constraints:

1 <= s.length, goal.length <= 100
s and goal consist of lowercase English letters. */

class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()) return false;

        int n = s.length();
        for(int gp = 0; gp < n; gp++) {
            if(goal.charAt(gp) == s.charAt(0)) {

                int sp = 0;
                int tempGp = gp;
                boolean match = true;

                while(sp < n) {
                    if(tempGp == n) tempGp = 0;

                    if(s.charAt(sp) != goal.charAt(tempGp)) {
                        match = false;
                        break;
                    }

                    sp++;
                    tempGp++;
                }

                if(match) return true;
            }
        }

        return false;
    }
}
//tc=o(n^2)
//sc=o(1)