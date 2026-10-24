import java.util.*;
public class P09_Insertionattail {
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}

    class Solution {
        public ListNode insertAtTail(ListNode head, int X) {
            ListNode current = head;
            ListNode tail=current;
            if (head == null){
                ListNode nsc = new ListNode(X);
                return nsc;
            }
            while (current!=null){
                if (current.next==null){
                    tail = current;
                }
                current = current.next;
            }
            ListNode nsc = new ListNode(X);
            tail.next = nsc;
            tail = nsc;
            return head;
        }
    }
}
