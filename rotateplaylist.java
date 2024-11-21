/*You are building a music playlist application, and you want to implement a feature that allows 
users to rotate their playlist to change the order of songs. Users can rotate their playlist by a 
non-negative number of steps (k steps). When a user rotates the playlist, the songs in the 
playlist should be moved to the right by k steps. 
If k is greater than the number of songs in the playlist, the rotation should wrap around, 
meaning that the songs at the end of the playlist should move to the beginning.
Example:
Input:
N = 7
nums = [1,2,3,4,5,6,7]
k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4] */

import java.util.Arrays;

public class RotatePlaylist {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        System.arraycopy(rotated, 0, nums, 0, n);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
