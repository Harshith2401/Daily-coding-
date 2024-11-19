import java.util.Scanner;
class oddevensum
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] nums={1,2,3,45,6};
        int evensum=0;
        int oddsum=0;
        for(int i=0;i< nums.length;i++)
        {
            if(i%2==0)
            {
                evensum=evensum+nums[i];
            }
            else
            {
                oddsum=oddsum+nums[i];
            }
        }
        if(evensum>oddsum)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println("1");
        }

    }
}
