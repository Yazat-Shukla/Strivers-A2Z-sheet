import java.util.*;
public class P06_Deletionoftailinlinkedlist {
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}


    class Solution {
        public ListNode deleteTail(ListNode head) {
            //your code goes here
            ListNode current =  head;
            if (head==null){
                return null;
            }
            if (head.next ==null){
                return null;
            }
            while (current!=null){
                if (current.next.next ==null){
                    current.next =current.next.next;
                }
                current = current.next;
            }
            return head;
        }
    }
}
