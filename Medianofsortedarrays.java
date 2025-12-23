/*4. Median of Two Sorted Arrays
Solved
Hard
Topics
premium lock icon
Companies
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106 */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int [] nums3=new int[n+m];
        int i=0,j=0,k=0;
        while(i<m&&j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                nums3[k]=nums1[i];
                i++;
            }
            else
            {
                nums3[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i < m) 
        {
            nums3[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n) 
        {
            nums3[k] = nums2[j];
            j++;
            k++;
        }
        double result;
        if(nums3.length%2!=0)
        {
            int index=nums3.length/2;
            result=(double)nums3[index];
        }
        else
        {
            int index1=nums3.length/2-1;
            int index2=nums3.length/2;
            int sum=nums3[index1]+nums3[index2];
            result=(double)sum/2;
        }
        return result;
        
    }
}
//tc=o(n+m)
//sc=o(n+m)