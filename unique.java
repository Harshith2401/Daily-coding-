import java.util.Scanner;
import java.util.HashMap;
class unique {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            HashMap<Integer,Integer>map=new HashMap<>();
            int size=sc.nextInt();
            int[] nums=new int[size];
            for(int j=0;j<size;j++)
            {
                nums[j]=sc.nextInt();
                if(map.containsKey(nums[j]))
                {
                    map.put(nums[j],map.get(nums[j])+1);
                }
                else
                {
                    map.put(nums[j],1);
                }
            }
            for (int num : nums) {
                if (map.get(num) == 1) {  // Find the unique number
                    System.out.println(num);
                    break;  // Break after printing the first unique number
                }
            }
        }
    }
}


