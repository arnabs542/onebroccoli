public class Solution {
    public int count(ListNode head) {
        if (head == null){
            return 0;
        }
        int count = 0;
        ListNode cur = head;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    public ListNode generate(int n) {
        int x = 0;
        ListNode head = new ListNode(x);
        ListNode cur = head;
        for (int i = 1; i < n; i++){
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        return head;
    }

    public String printList(ListNode head) {
        ListNode cur = head;
        String s = "";
        while(cur != null){
            s += Integer.toString(cur.value);
            if(cur.next != null){
                s+= "->";
            }
            cur = cur.next;
        }
        return s;
    }

    public static void main(String[] args) {
        //#1. Helper way
//        Solution s = new Solution();
//        ListNode head = s.generate(5);
//        System.out.println(s.count(head));

        //#2. If we don't use generate
//        Solution s = new Solution();
//        ListNode a = new ListNode(1);
//        ListNode b = new ListNode(7);
//        ListNode c = new ListNode(3);
//        ListNode d = new ListNode(5);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        System.out.println(s.count(a));
//        System.out.println(s.printList(a));


        //#3. OOP way
//        LinkedList list = new LinkedList();
//        list.insert(1);
//        list.insert(3);
//        list.count();
//        System.out.println(list.count());
//        System.out.println(list.toString());

        //#4. Best OOP way
        LinkedList list = new LinkedList(new int[]{1,3,7,5});
        System.out.println(list.count());
        System.out.println(list.toString());

    }
}
