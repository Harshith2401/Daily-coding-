

/*Given a string, print the frequency of characters. 

Eg : abcdace

Output

a : 2
b : 1
.
.*/
import java.util.HashMap;
import java.util.Map;
class Solution
{
    public Map<Character,Integer>frequency(String s)
    {
        Map<Character,Integer> mapping=new HashMap<>();//created a hashmap.
        if (s.isEmpty())
        {
            return -1;
        }
        for(char c:s.toCharArray())//TC=O(n)
        {
            if(mapping.containsKey(c))// if already the key exsists in map just the frequency is updated.
            {
                mapping.put(c,mapping.get(c)+1);
            }
            else
            {
                mapping.put(c,1);// if the key is not present in the map the key is put wiithe value of 1.
            }
        }
        System.out.println(mapping);// printing the map.
        return mapping;
    }
        public static void main(String[] args)
        {
            Solution solution=new Solution();
            String s="abbacd";
            solution.frequency(s);
        }
}
//TIMECOMPLEXCITY =O(n).