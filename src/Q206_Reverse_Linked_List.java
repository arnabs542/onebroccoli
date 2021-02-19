/*
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either
iteratively or recursively. Could you implement both?
 */
public class Q206_Reverse_Linked_List {
    public ListNode reverseList(ListNode head){
        if (head == null || head.next == null){
            return head; //sanity check
        }
        ListNode prev = null;
        while (head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}


