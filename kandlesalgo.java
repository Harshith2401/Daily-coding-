public class kandlesalgo {
    public static void main(String[] args) {
        int []nums={1,-1,2,-2,3,-3,4,-4};
        int currmax=nums[0];
        int maxofall=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            currmax=Math.max(nums[i],currmax+nums[i]);
            maxofall=Math.max(currmax,maxofall);
        }
        System.out.println(maxofall);
    }
    
}
