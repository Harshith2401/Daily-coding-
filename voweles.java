/*1456. Maximum Number of Vowels in a Substring of Given Length
Solved
Medium
Topics
Companies
Hint
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 

Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels. */

class Solution {
    public int maxVowels(String s, int k) {
        int i, j, count = 0, maxCount;
        String sub;
        char ch1, ch2;
        for(i=0;i<k;i++) { //finding vowels in a window of k
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
                count++;
            }
        }
        if(count==k) //maximum vowels can be k only
            return k;
            maxCount = count;
            j = k; //pointer to check the new character after k window
        for(i=0;i<s.length()-k;i++) {
            ch1 = s.charAt(i);
            if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u') { //decreasing the count if the element before window contains a vowel
                count--;
            }
            ch2 = s.charAt(j++);
            if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u') { //increasing the count if the element after window contains a vowel
                count++;
            }
            if(count > maxCount)
                maxCount = count;
            if(count==k)
                return k;
        }
        return maxCount;
    }
}