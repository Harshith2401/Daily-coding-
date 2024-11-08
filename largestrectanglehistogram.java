/*Largest Rectangle In Histogram
Solved 
You are given an array of integers heights where heights[i] represents the height of a bar. The width of each bar is 1.

Return the area of the largest rectangle that can be formed among the bars.

Note: This chart is known as a histogram.

Example 1:

Input: heights = [7,1,7,2,2,4]

Output: 8
Example 2:

Input: heights = [1,3,7]

Output: 7
Constraints:

1 <= heights.length <= 1000.
0 <= heights[i] <= 1000
 */

 class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
        int maxarea = 0, index, height;
        //Iterate through each bar
        for (int i = 0; i < heights.length; i++) {
            int start = i;
            //Process bars in stack that are taller than the current bar
            while (!stack.isEmpty() && stack.peek()[1] > heights[i]) {
                int[] top = stack.pop(); 
                index = top[0];    
                height = top[1];    
                maxarea = Math.max(maxarea, height * (i - index)); // Calculate area
                start = index;  // We need to track where the current rectangle can extend to
            }
            
            //Push the current bar with its correct starting index into the stack
            stack.push(new int[]{start, heights[i]});
        }
        
        //Process remaining bars in the stack
        for (int[] pair : stack) {
            index = pair[0];
            height = pair[1];
            maxarea = Math.max(maxarea, height * (heights.length - index)); // Calculate remaining areas
        }
        
        return maxarea;
    }
}
