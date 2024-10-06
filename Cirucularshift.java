/*Given an array of 10 two-digit numbers, develop a program that does the following:
The elements in the even position should be shifted right (circular shift) by two 
positions and the elements in the odd position should be shifted left (circular shift) 
by two positions.
INPUT : 
12 23 71 34 92 43 12 67 72 88
OUTPUT:
71 88 92 23 12 34 72 43 12 67 */
import java.util.Scanner;
import java.util.Array;
class Circularshift
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int nums[]=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++)
        {
            nums[i]=sc.nextInt();
        }
        int nums1[]=new int [size];
        //odd position
        for(int i=1;i<size;i+=2)
        {
            int newindex=i+2;
            if(newindex>=size)
            {
                newindex=newindex-size;
            }
            nums1[newindex]=nums[i];
        }
        //even postion
        for(int i=0;i<size;i+=2)
        {
            int newindex=i-2;
            if(newindex<0)
            {
                newindex=newindex+size;
            }
            nums1[newindex]=nums[i];
        }
        for (int i = 0; i < size; i++) 
        {
            System.out.print(nums1[i] + " ");
        }
    }

}
