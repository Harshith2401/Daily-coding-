/*
Code


Testcase
Testcase
Test Result
1423. Maximum Points You Can Obtain from Cards
Solved
Medium
Topics
premium lock icon
Companies
Hint
There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.

In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

Your score is the sum of the points of the cards you have taken.

Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

 

Example 1:

Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.
Example 2:

Input: cardPoints = [2,2,2], k = 2
Output: 4
Explanation: Regardless of which two cards you take, your score will always be 4.
Example 3:

Input: cardPoints = [9,7,7,9,7,7,9], k = 7
Output: 55
Explanation: You have to take all the cards. Your score is the sum of points of all cards. */

class Solution {
    public int maxScore(int[] cardPoints,int k) {
        int n=cardPoints.length;
        int total_sum=0;
        for(int i=0;i<n;i++) 
        { 
            total_sum=total_sum+cardPoints[i]; 
        }
        int window=n-k;
        if(window==0) 
        {
            return total_sum;
        }
        int curr=0;
        for(int i=0;i<window;i++) 
        { 
            curr=curr+cardPoints[i]; 
        }
        int min_sum=curr;

        for(int left=1,right=window;right<n;left++,right++) 
        {
            curr=curr-cardPoints[left-1]+cardPoints[right];
            min_sum=Math.min(min_sum,curr);
        }
        return total_sum-min_sum;
    }
}

//tc=o(n)
//sc=o(1)