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
        
        int min=Integer.MAX_VALUE;
        // finding out the min index.
        for (HashMap.Entry<Character, ArrayList<Integer>>entry:map.entrySet())//tc=O(n) 
        {
            if (entry.getValue().size() == 1) {
                int curr=entry.getValue().get(0);
                if(curr<min)
                {
                    min=curr;
                }
            }
        }
        if(min==Integer.MAX_VALUE)
        {
            System.out.println("-1");
        } 
        else 
        {
            System.out.println(min);
        }
        
    }
}
//TIMECOMPLECITY=O(n).
