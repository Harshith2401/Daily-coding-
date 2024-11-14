class Allsubarrays
{
    public static void main(String args[])
    {
        int []nums={1,2,3,45,6};
        for(int i=0;i<nums.length;i++)
        {
            for(int j =i;j<nums.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(nums[k]+" ");
                }
                System.out.println();

            }
            

        }

    }
}