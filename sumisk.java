/*Given an array, find two numbers whose sum = k, using the hashing concept. Print indices of those two elements.
Compare TCs of your earlier soln without hashing and this. 
Eg : A : { 1, 2, 3, 4, 5 } k = 5
Result :
{ 0,3}
{ 1,2} */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Allsumpairs
{
    public static List<int[]> Alltwosumpairs(int[] nums,int target)
    {
        List<int[]>result=new ArrayList<>();//creating a list which contains arrays.
        HashMap<Integer,List<Integer>>map=new HashMap<>();// creating a hash map
        for(int i=0;i<nums.length;i++)//TC=O(n)
        {
            int compl=target-nums[i];//finding the compliment.
            if(map.containsKey(compl))
            {
                for(int index:map.get(compl))//Tc=O(n^2)
                {
                    result.add(new int[] {index,i});// here in the list array gets created and index,i is added.
                }
            }
            map.putIfAbsent(nums[i],new ArrayList<>()); // when the input element is not there in map,add element with an empty array
            //map.get(nums[i]) retrieves the value (index) associated with the key nums[i] from the HashMap map.
            //add(i) adds the current index i to the list retrieved from map.get(nums[i])
            map.get(nums[i]).add(i)
        }
        return result;
    }
    public static void main(String[]args)
    {
        int[] num={2,2,3,3,5,0,5,4,4,1};
        int target=5;
        List<int[]> result=Alltwosumpairs(num,target);
        for(int[] pair:result)
        {
            //in the list we have arrays and elements in that are in pairs.
            System.out.println(pair[0]+","+pair[1]);//list is printed.
        }
    }
}
//TIMECOMPLXICITY=O(n^2)
/*NOTE POINTS* 
--always the keys are unique and values need not be unique in hash map
--key and value are decided based on the many parameters it may be searching retriving
--there is no compulosry to store unique in key and rest in values .
---we can create a list which consists of array
---*/
