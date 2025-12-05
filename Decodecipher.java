/* Problem: Decode Circular Shift Cipher

A message is encoded using a special cipher that shifts characters based on their position in the string.
The alphabet is treated as circular, meaning:

After 'z' comes 'a'

Before 'a' comes 'z'

You are given a lowercase string s and two integers X and Y.

Indexing is 1-based:

Characters at odd indices (1, 3, 5, …) are shifted forward by X positions

Characters at even indices (2, 4, 6, …) are shifted backward by Y positions

Your task is to decode the encrypted message and return the resulting string.

🔹 Example 1

Input:

s = "abcdef"
X = 2
Y = 1


Output:

"caecge"


Explanation:

Index (1-based)	Char	Rule	Shift	Result
1	a	odd → +2	a→c	c
2	b	even → −1	b→a	a
3	c	odd → +2	c→e	e
4	d	even → −1	d→c	c
5	e	odd → +2	e→g	g
6	f	even → −1	f→e	e

Final decoded message:

"caecge"

🔹 Constraints

1 ≤ s.length ≤ 10^5

s consists only of lowercase English letters ('a' to 'z')

0 ≤ X, Y ≤ 10^9

Shifts must wrap around circularly in the alphabet*/

class Solution {
    public String oddandeven(String s, int X, int Y) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length(); i++) {
            int ascii = sb.charAt(i);
            if((i + 1) % 2 == 1) 
            {
                ascii = ascii + X;
                if(ascii > 'z') 
                {
                    ascii = ascii - 26;
                }
            }
            else 
            {
                ascii = ascii - Y;
                if(ascii < 'a') 
                {
                    ascii = ascii + 26;
                }
            }
            sb.setCharAt(i, (char)ascii);
        }
        return sb.toString();
    }
}
