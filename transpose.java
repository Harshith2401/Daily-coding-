import java.util.Scanner;
public class transpose 
{
 public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row size");
        int rsize=sc.nextInt();
        System.out.println("enter the coloumn size");
        int csize=sc.nextInt();
        int nums[][]= new int[rsize][csize];
        System.out.println("enter the elemenst of the matrix");
        for(int i =0;i<rsize;i++)
        {
            for(int j=0;j<csize;j++)
            {
                nums[i][j]=sc.nextInt();
            }
        }
        System.out.println("the transposed matrix is");
        for(int j=0;j<csize;j++)
        {
            for(int i=0;i<rsize;i++)
            {
                System.out.print(nums[i][j]+" ");
            }
        }
        





    }

    
}
