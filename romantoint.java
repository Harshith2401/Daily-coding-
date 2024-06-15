/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.*/
class Solution {
    public int romanToInt(String s) {
        int size = s.length(), ans = 0;
        for (int i = 0; i < size; i++)//O(n) 
        {
            if (i + 1 < size && s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') 
            {
                ans += 4;
                i++;
            } 
            else if (i + 1 < size && s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') 
            {
                ans += 9;
                i++;
            } 
            else if (i + 1 < size && s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') 
            {
                ans += 40;
                i++;
            }
             else if (i + 1 < size && s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') 
            {
                ans += 90;
                i++;
            } 
            else if (i + 1 < size && s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') 
            {
                ans += 400;
                i++;
            } else if (i + 1 < size && s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') 
            {
                ans += 900;
                i++;
            } 
            else if (s.charAt(i) == 'I') 
            {
                ans += 1;
            } 
            else if (s.charAt(i) == 'V') 
            {
                ans += 5;
            } 
            else if (s.charAt(i) == 'X') 
            {
                ans += 10;
            } 
            else if (s.charAt(i) == 'L') 
            {
                ans += 50;
            } 
            else if (s.charAt(i) == 'C') 
            {
                ans += 100;
            } 
            else if (s.charAt(i) == 'D') 
            {
                ans += 500;
            } 
            else if (s.charAt(i) == 'M') 
            {
                ans += 1000;
            }
        }
        return ans;
    }
}
//TIME COMPLIXIXCITY IS =O(n)
/*here in if condition we checked first i+1<size to avoid out of bound error */
        
