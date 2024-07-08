/*Given a string S of lowercase English letters, the task is to find the index of the first non- repeating character. If there is no such A character, return -1.*/
public class Firstoccurence2 
{
    public static void main(String args[])
    {
        String s="aaabbbccc";
        char[] arr=s.toCharArray();
        int result=Firstoccurence(arr);
        System.out.println(result);
        

    }
    public static int Firstoccurence(char[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {   
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                return i;
            }
        }
        return -1;
    }
    
}
//TIMECOMPLEXCITY=O(n)
