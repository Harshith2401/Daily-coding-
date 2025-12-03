/*557. Reverse Words in a String III
Solved
Easy
Topics
premium lock icon
Companies
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "Mr Ding"
Output: "rM gniD"
 

Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space. */

class Solution {
    public String reverseWords(String s) {

        int right = 0;
        int left = 0;
        int index;
        char temp;

        StringBuilder sb = new StringBuilder(s);

        while(right < s.length())
        {
            //skip spaces BEFORE starting a word
            while(right < s.length() && s.charAt(right) == ' ')
            {
                right++;
            }

            left = right; // word starts here

            // move right until space or end
            while(right < s.length() && s.charAt(right) != ' ')
            {
                right++;
            }

            index = right - 1;   // end of current word

            // reverse the word from left to index
            int i = left;
            int j = index;

            while(i < j)
            {
                temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);

                i++;
                j--;
            }

            left = right + 1;   // move to start of next word
            right = right + 1;  // move right forward
        }

        return sb.toString();
    }
}
//tc=o(n)
//sc=o(n)
