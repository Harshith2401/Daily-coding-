import java.util.*;

public class  contagiousmax{
    public static void max(int[] nums, int k) {
        for(int i=0;i<=nums.length-k;i++) {
            int maxVal=nums[i];
            for(int j=i;j<i+k;j++) {
                if(nums[j]>maxVal) maxVal=nums[j];
            }
            System.out.print(maxVal+" ");
        }
    }

    public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=4;
        max(nums,k);
    }
}
