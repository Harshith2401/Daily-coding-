
/*  66.PLUS ONE.
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. 
The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].*/
 
class Solution {
    public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) // loop from the backside.
    {
	    if (digits[i] < 9) // condition if the digit is <9
        {
		    digits[i]++; // increment the digit.
		    return digits;// return the digits and exit.
	    }
	    digits[i] = 0; // condition if the digit is >9 .just put 0 in place of it.
    }
    // this condition whe all the dogits are 9s.we have to increse the array.
    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;    
    }
}
// TIMECOMPLIXICITY =O(n).