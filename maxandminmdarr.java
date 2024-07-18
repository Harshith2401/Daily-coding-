import java.util.Scanner;
public class maxandminmdarr 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row size of mat");
        int rsize=sc.nextInt();
        System.out.println("enter the coloumn size of mat");
        int csize=sc.nextInt();
        int nums[][]= new int[rsize][csize];
        System.out.println("enter the elemenst of the matrix mat");
        for(int i =0;i<rsize;i++)
        {
            for(int j=0;j<csize;j++)
            {
                nums[i][j]=sc.nextInt();
            }
        }
        int max=nums[0][0];
        int min=nums[0][0];
        for(int i=0;i<rsize;i++)
        {
            for(int j=0;j<csize;j++)
            {
                if(max<=nums[i][j])
                {
                    max=nums[i][j];
                }
                if(min>=nums[i][j])
                {
                    min=nums[i][j];
                }
            }
        }
        System.out.println("the max elment is "+max);
        System.out.println("the min element is "+min);
    }
    
}
