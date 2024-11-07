/*Daily Temperatures
Solved 
You are given an array of integers temperatures where temperatures[i] represents the daily temperatures on the ith day.

Return an array result where result[i] is the number of days after the ith day before a warmer temperature appears on a future day. If there is no day in the future where a warmer temperature will appear for the ith day, set result[i] to 0 instead.

Example 1:

Input: temperatures = [30,38,30,36,35,40,28]

Output: [1,4,1,2,1,0,0]
Example 2:

Input: temperatures = [22,21,20]

Output: [0,0,0]
Constraints:

1 <= temperatures.length <= 1000.
1 <= temperatures[i] <= 100

 */
class Solution 
{
    public int[] dailyTemperatures(int[] temperature) 
    {
        int res[]=new int[temperature.length];
        Stack<int[]> stack=new Stack<>();// declaring stack to store pair if values
        for(int i=0;i<temperature.length;i++)
        {
            int t=temperature[i];
            while (!stack.isEmpty()&&t>stack.peek()[0]) {
                int[] pair = stack.pop();
                res[pair[1]]=i-pair[1];
            }
            stack.push(new int[]{t, i});
        }
        return res;
    }
}
// time complexicity=O(n)     