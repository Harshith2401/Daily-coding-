import java.util.Scanner;
public class Maxofrowsum 
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
        for(int i=0;i<rsize;i++)
        {
            for(int j=0;j<csize;j++)
            {
                nums[i][j]=sc.nextInt();
                sum=sum+nums[i][j];

            }
            System.out.println("row sum is:"+sum+"\n");
            if(max<=sum)
            {
                max=sum;
            }
            sum=0;
            
        }
        System.out.println("max row sum:"+max);

    }
    
}
