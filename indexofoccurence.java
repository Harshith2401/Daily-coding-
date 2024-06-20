/*28.FIND THE INDEX OF FIRST OCCURENCE.
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.*/

class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length())//if haystack < needle it can never have needle.
        {
            return -1;
        }
        if(haystack.contains(needle))
        {
            for(int i=0,j=needle.length(); j<=haystack.length();i++,j++)//i,j are placed in such a way that the diffrence btween them is
                                                                            //excatly length of needle.
            {
                if(haystack.substring(i,j).equals(needle))
                {
                    return i;
                }
            }
            
        }
        else
        {
            return -1;
        }
        return -1;
    }
}
//TIMECOMPLIXICITY is =O(n)