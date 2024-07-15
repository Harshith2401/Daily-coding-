import java.util.Scanner;
class jaggedarray 
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row size");
        int rsize=sc.nextInt();
        int nums[][]=new int[rsize][];
        for(int i=0;i<nums.length;i++)
        {
            System.out.println("eneter the coloumn size");
            int csize=sc.nextInt();
            nums[i]=new int[csize];
        }
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                nums[i][j]=sc.nextInt();
                sum=sum+nums[i][j];
            }
            if(sum>max)
            {
                max=sum;
            }
            sum=0;
        }
        System.out.println(max);


    }
}
