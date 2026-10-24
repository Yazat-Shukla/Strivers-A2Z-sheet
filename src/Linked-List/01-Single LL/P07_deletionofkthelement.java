import java.util.*;
public class P07_deletionofkthelement {

class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
    class Solution {
        public ListNode deleteKthNode(ListNode head, int k) {
            // Your code goes here
            int size = 1;
            ListNode current = head;
            ListNode prev =null;
            if (size==k){
                return head.next;
            }
            while(current!=null){
                if (size==k){

                    prev.next = current.next;
                    current.next = null;
                    break;
                }
                prev = current;
                current = current.next;
                size++;
            }
            return head;

        }
    }
}
