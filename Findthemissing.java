/*Qus 6:-Find the Missing Number

Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.

Note: There are no duplicates in the list.

Sample  Input:
 arr[] = {1, 2, 4, 6, 3, 7, 8} , N = 8
Sample Output:
 5

Explanation: Here the size of the array is 8, so the range will be [1, 8]. The missing number between 1 to 8 is 5
Input: arr[] = {1, 2, 3, 5}, N = 5*/
import java.util.Scanner;
class Findthemissing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] nums=new int[size];
        for(int i=0;i<nums.length-1;i++)
        {
            nums[i]=sc.nextInt();
        }
        int expectedSum = size * (size + 1) / 2;
        int actualsum=0;
        for(int j=0;j<nums.length-1;j++)
        {
            actualsum=actualsum+nums[j];
        }
        int missing=expectedSum-actualsum;
        System.out.println(missing);


    }
}