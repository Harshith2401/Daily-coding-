/*- Write a java program to multiply two matrices? */
import java.util.Scanner;
class multiplicationofmat 
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row size of mat1");
        int rsize1=sc.nextInt();
        System.out.println("enter the coloumn size of mat1");
        int csize1=sc.nextInt();
        int nums1[][]= new int[rsize1][csize1];
        System.out.println("enter the elemenst of the matrix mat1");
        for(int i =0;i<rsize1;i++)
        {
            for(int j=0;j<csize1;j++)
            {
                nums1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the row size of mat2");
        int rsize2=sc.nextInt();
        System.out.println("enter the coloumn size of mat2");
        int csize2=sc.nextInt();
        int nums2[][]= new int[rsize2][csize2];
        System.out.println("enter the elemenst of the matrix mat2");
        for(int i =0;i<rsize2;i++)
        {
            for(int j=0;j<csize2;j++)
            {
                nums2[i][j]=sc.nextInt();
            }
        }
        if(csize1!=rsize2)
        {
            System.out.println("compatability issues");
        }
        else
        {
            int nums3[][]= new int[rsize1][csize2];
            for(int i=0;i<rsize1;i++)
            {
                for(int j=0;j<csize1;j++)
                {
                    for(int k=0;k<csize2;k++)
                    {
                        nums3[i][k]=nums1[i][j]*nums2[j][k];
                    }
                }
            }
            
            System.out.println("the multiplication matrix");
            for(int i =0;i<rsize1;i++)
            {
                for(int j=0;j<csize2;j++)
                {
                    System.out.println(nums3[i][j]+" ");
                }
            }
        }
    }   
}
/*Compatibility: For two matrices to be multiplied, the number of columns in the first matrix (Matrix A) must be equal to the number of rows in the second matrix (Matrix B). If Matrix A is of size 
𝑚
×
𝑛
m×n and Matrix B is of size 
𝑛
×
𝑝
n×p, the resultant matrix (Matrix C) will be of size 
𝑚
×
𝑝
m×p. */
