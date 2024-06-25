/*Given an array, find two numbers whose sum = k, using the hashing concept. Print indices of those two elements.

Compare TCs of your earlier soln without hashing and this. 

Eg : A : { 1, 2, 3, 4, 5 } k = 5

Result :
{ 0,3}
{ 1,2} 
.
.
.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer>mapping=new HashMap<>();
        int target=5;
        int nums[]={1,2,3,4,5};
        for(int i=0;i<nums.length;i++)//TC=O(n)
        {
            mapping.put(nums[i],i);//important decalre the elements as keys.
        }
        for(Integer num1 : mapping.values())// iterating through the map.
        {
            int num2=target-num1;
            if (mapping.containsKey(num2)&&mapping.get(num2)!=mapping.get(num1))// check the duplicate condition (same indices)
            {
                System.out.println(mapping.get(num1)+" "+mapping.get(num2));
            }
        }
    }
}
//TIMECOMPLXICITY=O(n)

/*NOTE POINTS* 
---here the key should be always the elements in the array.*/
