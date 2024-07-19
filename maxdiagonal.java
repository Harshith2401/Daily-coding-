import java.util.Scanner;
public class maxdiagonal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the row size");
        int rsize=sc.nextInt();
        System.out.println("enetr the column size");
        int csize=sc.nextInt();
        int sum1=0,sum2=0;
        int nums[][]=new int[rsize][csize];
        System.out.println("enetr the elements of array");
        for(int i=0;i<rsize;i++)
        {
            for(int j=0;j<csize;j++)
            {
                nums[i][j]=sc.nextInt();
                if(i==j)
                {
                    sum1=sum1+nums[i][j];
                }

            }    
        }
        for(int i=0,j=csize-1;i<rsize&&j>=0;i++,j--)
        {
            sum2=sum2+nums[i][j];
        }

        if(sum1>=sum2)
        {
            System.out.println(sum1);
        }
        else
        {
            System.out.println(sum2);
        }

    }
    
}

