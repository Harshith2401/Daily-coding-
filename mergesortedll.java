/*Merge Two Sorted Linked Lists
Solved 
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted linked list and return the head of the new sorted linked list.

The new list should be made up of nodes from list1 and list2.

Example 1:



Input: list1 = [1,2,4], list2 = [1,3,5]

Output: [1,1,2,3,4,5] */
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode list3= new ListNode();
        ListNode curr=list3;
        while(list1!=null&&list2!=null)
        {
            if(list1.val>list2.val)
            {
                curr.next=list2;
                list2=list2.next;
            }
            else
            {
                curr.next=list1;
                list1=list1.next;
            }
            curr=curr.next;
        }
        curr.next=(list1!=null)?list1:list2;
        return list3.next;
    }
}
