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
    //Method1: Iteration
    //Space: O(1)
    //Time: O(n)
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

    //Method2: recursion
    //Space: O(n)
    //Time: O(n)
    public ListNode reverseList2(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}


