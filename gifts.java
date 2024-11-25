/*A. Presents
time limit per test2 seconds
memory limit per test256 megabytes
Little Petya very much likes gifts. Recently he has received a new laptop as a New Year gift from his mother. He immediately decided to give it to somebody else as what can be more pleasant than giving somebody gifts. And on this occasion he organized a New Year party at his place and invited n his friends there.

If there's one thing Petya likes more that receiving gifts, that's watching others giving gifts to somebody else. Thus, he safely hid the laptop until the next New Year and made up his mind to watch his friends exchanging gifts while he does not participate in the process. He numbered all his friends with integers from 1 to n. Petya remembered that a friend number i gave a gift to a friend number pi. He also remembered that each of his friends received exactly one gift.

Now Petya wants to know for each friend i the number of a friend who has given him a gift.

Input
The first line contains one integer n (1 ≤ n ≤ 100) — the quantity of friends Petya invited to the party. The second line contains n space-separated integers: the i-th number is pi — the number of a friend who gave a gift to friend number i. It is guaranteed that each friend received exactly one gift. It is possible that some friends do not share Petya's ideas of giving gifts to somebody else. Those friends gave the gifts to themselves.

Output
Print n space-separated integers: the i-th number should equal the number of the friend who gave a gift to friend number i.

Examples
InputCopy
4
2 3 4 1
OutputCopy
4 1 2 3
InputCopy
3
1 3 2
OutputCopy
1 3 2
InputCopy
2
1 2
OutputCopy
1 2
 */    s
import java.util.Scanner;
public class gifts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int nums[]=new int[size];
        int nums1[]=new int[size];
        for(int i=0;i<size;i++)
        {
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            int j=nums[i];
            nums1[j-1]=i+1;
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(nums1[i]+" ");
        }
        
    }
    
}
