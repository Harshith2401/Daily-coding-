/*242. Valid Anagram
Solved
Easy
Topics
premium lock icon
Companies
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters. */
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) 
        {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < t.length(); i++) 
        {
            char c = t.charAt(i);
            if(!map.containsKey(c) || map.get(c) == 0) 
            {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        return true;
    }
}
//tc=o(n)
//sc=o(1)