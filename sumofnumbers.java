/*Add Two Numbers
Solved 
You are given two non-empty linked lists, l1 and l2, where each represents a non-negative integer.

The digits are stored in reverse order, e.g. the number 123 is represented as 3 -> 2 -> 1 -> in the linked list.

Each of the nodes contains a single digit. You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Return the sum of the two numbers as a linked list.

Example 1:



Input: l1 = [1,2,3], l2 = [4,5,6]

Output: [5,7,9]

Explanation: 321 + 654 = 975.
Example 2:

Input: l1 = [9], l2 = [9]

Output: [8,1]
Constraints:

1 <= l1.length, l2.length <= 100.
0 <= Node.val <= 9
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 class Solution {
    public ListNode addTwoNumbers(ListNode l1,ListNode l2) {
        ListNode list=new ListNode(0);
        int sum=0,carry=0;
        ListNode ptr1=l1,ptr2=l2,ptr3=list;
        while(ptr1!=null||ptr2!=null) {
            int x,y;
            x=(ptr1!=null)?ptr1.val:0;
            y=(ptr2!=null)?ptr2.val:0;
            sum=carry+x+y;
            carry=sum/10;
            ptr3.next=new ListNode(sum%10);
            ptr3=ptr3.next;
            if(ptr1!=null) 
                ptr1=ptr1.next;
            if(ptr2!=null) 
                ptr2=ptr2.next;
        }
        if(carry>0) 
            ptr3.next=new ListNode(carry);
        return list.next;
    }
}
