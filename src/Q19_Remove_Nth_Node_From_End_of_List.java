/*
Given the head of a linked list, remove the nth node from
the end of the list and return its head.

Follow up: Could you do this in one pass?



Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]


Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
 */


/*
Solution:
Two pass:
先遍历find length, 然后找到该node进行skip操作

One pass:
two pointer, fast and slow with gap n , fast 是slow的n+ 1
等到fast.next = null时， slow就处于指定位置，进行skip操作
 */
public class Q19_Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow  = dummy;
        ListNode fast = dummy;
        //start moving the first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++){
            fast = fast.next;
        }
        //fast pointer gets to the position, now slow pointer starts
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        //skip the node
        slow.next = slow.next.next;
        return dummy.next;
    }
}
