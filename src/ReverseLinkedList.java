/*
use two ways to reverse liked list
1 -> 2 -> 3
prev = null
next = head.next
head.next = prev
prev = head

1 <- 2 <- 3
这个方法好，可以print整个linked list
https://www.geeksforgeeks.org/recursively-reversing-a-linked-list-a-simple-implementation/
 */
public class ReverseLinkedList {
    public ListNode reverseLinkedListIter(ListNode head){
        ListNode prev = null;
        while (head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
        }
        return prev;
    }

//    public ListNode reverseLinkedListRecursion(ListNode head){
//        if (head == null || head.next == null){
//            return head;
//        }
//        ListNode newHead = head.next;
//
//        return head;
//
//    }
    public static void printSinglyLinkedList(ListNode node, String seperation){
        while (node != null){
            System.out.print(String.valueOf(node.val) + seperation);
            node = node.next;
        }
    }
    public static void main(String[] args){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println("Given linked list: ");
        printSinglyLinkedList(a, " ");
    }
}
