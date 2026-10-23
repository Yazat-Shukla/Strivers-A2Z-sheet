
import java.util.*;
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}


class P01_traversalinlinkedlist {
    public List<Integer> LLTraversal(ListNode head) {
        //your code goes here

        ListNode current =head;
        List<Integer> ls = new ArrayList<>();
        while (current !=null){
            ls.add(current.data);
            current = current.next;

        }
        return ls;
    }
}