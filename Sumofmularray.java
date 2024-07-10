import java.util.Scanner;
class sum
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
        System.out.println("enetr the elements of array");
        for(int i=0;i<rsize;i++)
        {
            for(int j=0;j<csize;j++)
            {
                nums[i][j]=sc.nextInt();
                sum=sum+nums[i][j];

            }
        }
        System.out.println("the sum is: ");
        System.out.println(sum);



    }
}
