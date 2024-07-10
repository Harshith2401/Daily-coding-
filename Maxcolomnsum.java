import java.util.Scanner;
public class Maxcolomnsum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the row size");
        int rsize=sc.nextInt();
        System.out.println("enetr the column size");
        int csize=sc.nextInt();
        int sum=0;
        int nums[][]=new int[rsize][csize];
        int max=0;
        System.out.println("enetr the elements of array");
        for(int j=0;j<csize;j++)
        {
            for(int i=0;i<rsize;i++)
            {                 
                nums[i][j]=sc.nextInt();
                sum=sum+nums[i][j];
            }
            if(max<=sum)
            {
                max=sum;
            }
            sum=0;
            
        }
        System.out.println("max row sum:"+max);

    }
    
}
