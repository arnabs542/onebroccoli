public class LinkedList {

    public ListNode head; //null

    public LinkedList() {
    }

    public LinkedList(int[] array){
        for(int i=0; i<array.length; i++){
            this.insert(array[i]);
        }
    }

    public int count() {
        if (this.head == null){
            return 0;
        }
        int count = 0;
        ListNode cur = this.head;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    public String toString() {
        ListNode cur = this.head;
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

    public void insert(int x){
        if (this.head == null){
            this.head = new ListNode(x);
            return;
        }

        ListNode cur = this.head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = new ListNode(x);
    }
}
