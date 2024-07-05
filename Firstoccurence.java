/*Given a string S of lowercase English letters, the task is to find the index of the first non- repeating character. If there is no such A character, return -1.*/

import java.util.HashMap;
import java.util.ArrayList;
class FirstOccurrence 
{
    public static void main(String args[]) 
    {
        HashMap<Character, ArrayList<Integer>>map=new HashMap<>();
        String s ="aaabbbccc";
        int i = 0;
        char[] charArray=s.toCharArray();
        int size=s.length();

        // Populate the map with character indices
        for (char c:charArray)//TC=O(n)
        {
            if (!map.containsKey(c)) {
                map.put(c,new ArrayList<>());
            }
            map.get(c).add(i);
            i++;
        }
        ArrayList<Integer>nums=new ArrayList<>();

        // Collect indices of characters that appear only once
        for (HashMap.Entry<Character, ArrayList<Integer>>entry:map.entrySet())//tc=O(n) 
        {
            if (entry.getValue().size() == 1) {
                nums.add(entry.getValue().get(0));
            }
        }

        // return the minimum index or return -1 if no non-repeating character exists
        if (nums.size()==0) 
        {
            System.out.println(-1);
        } 
        else 
        {
            int min=nums.get(0);
            for (int index:nums)//tc=O(n)
            {
                if (min>index) 
                {
                    min=index;
                }
            }
            System.out.println(min);
        }
    }
}
//TIMECOMPLECITY=O(n).
