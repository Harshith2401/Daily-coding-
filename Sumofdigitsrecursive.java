/*The sum of the digits of 18117 is 1+8+1+1+7 = 18. Just as we can separate the 
number, we can separate this sum into the last digit, 7, and the sum of all but the 
last digit, 1+8+1+1 = 11. Write a recursive function to sum the digits of a number n, 
add its last digit to the sum of the digits of n. There's one special case: if a number 
has only one digit, then the sum of its digits is itself */
import java.util.Scanner;
import java.util.ArrayList;
class Sumofdigitsrecursive
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the the number:");
        int num=sc.nextInt();
        ArrayList<Integer>numArray=new ArrayList<>();
        while(num>0)
        {
            numArray.add(0,num%10);
            num/=10;
        }
        if(numArray.size()==1)
        {
            System.out.println(numArray.get(0));
        }
        else
        {
            int sum=0;
            for (int i=0;i<numArray.size();i++)
            {
                sum+=numArray.get(i);
                System.out.println("Sum after adding" + numArray.get(i) + ":" + sum);
            }
        }
    }
}
//TIME COMPLEXCITY=O(n)
