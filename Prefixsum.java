import java.util.*;
public class Prefixsum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] presum=new int[size];
        presum[0]=arr[0];
        for(int j=1;j<size;j++)
        {
            presum[j]=presum[j-1]+arr[j];
        }
        System.out.println("the presum array is");
        for(int i=0;i<size;i++)
        {
            System.out.print(presum[i]+" ");
        }
        System.out.println("enter the left index and right index");
        int left=sc.nextInt();
        int right=sc.nextInt();
        int result;
        if (left == 0) {
            result = presum[right];
        } else {
            result = presum[right] - presum[left - 1];
        }
        System.out.println("the result is");
        System.out.println(result);
    
        sc.close();
    }
    
}
