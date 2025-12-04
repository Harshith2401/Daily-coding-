/*
Code


Testcase
Testcase
Test Result
1790. Check if One String Swap Can Make Strings Equal
Solved
Easy
Topics
premium lock icon
Companies
Hint
You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.

Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.

 

Example 1:

Input: s1 = "bank", s2 = "kanb"
Output: true
Explanation: For example, swap the first character with the last character of s2 to make "bank".
Example 2:

Input: s1 = "attack", s2 = "defend"
Output: false
Explanation: It is impossible to make them equal with one string swap.
Example 3:

Input: s1 = "kelb", s2 = "kelb"
Output: true
Explanation: The two strings are already equal, so no string swap operation is required.
 

Constraints:

1 <= s1.length, s2.length <= 100
s1.length == s2.length
s1 and s2 consist of only lowercase English letters. */

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {

        int error = 2;
        int swap1 = -1, swap2 = -1;

        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == s2.charAt(i)) continue;

            if(error == 2) swap1 = i;
            else if(error == 1) swap2 = i;
            else return false;

            error--;
        }

        if(error == 2) return true;
        if(error == 1) return false;

        char[] arr = s2.toCharArray();
        char temp = arr[swap1];
        arr[swap1] = arr[swap2];
        arr[swap2] = temp;

        String swapped = new String(arr);

        return s1.equals(swapped);
    }
}

//tc=o(n)
//sc=o(n)