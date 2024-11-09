/*Reverse Nodes in K-Group
Solved 
You are given the head of a singly linked list head and a positive integer k.

You must reverse the first k nodes in the linked list, and then reverse the next k nodes, and so on. If there are fewer than k nodes left, leave the nodes as they are.

Return the modified list after reversing the nodes in each group of k.

You are only allowed to modify the nodes' next pointers, not the values of the nodes.

Example 1:



Input: head = [1,2,3,4,5,6], k = 3

Output: [3,2,1,6,5,4]
Example 2:



Input: head = [1,2,3,4,5], k = 3

Output: [3,2,1,4,5]
Constraints:

The length of the linked list is n.
1 <= k <= n <= 100
0 <= Node.val <= 100
 */

 class Solution {
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        ListNode ptr1=head;
        ListNode ptr2=null;
        ListNode ptr3=head;
        for(int i=0;i<k;i++) 
        {
            if(ptr3==null) return head;
            ptr3=ptr3.next;
        }
        for(int i=0;i<k;i++)
        {
            ListNode temp=ptr1.next;
            ptr1.next=ptr3;
            ptr3=ptr1;
            ptr1=temp;
        }
        if(ptr1!=null) head.next=reverseKGroup(ptr1,k);
        
        return ptr3;
    }
}
//TIMECOMPLEXCITY=O(n)

