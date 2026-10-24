public class P08_Deleteelementwithvaluex {
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}

    class Solution {
        public ListNode deleteNodeWithValueX(ListNode head, int X) {
            ListNode current = head;
            if (head.data == X){
                current=current.next;
                return current;
            }
            while (current.next!=null){
                if (current.next.data == X){
                    current.next = current.next.next;
                    break;
                }
                current = current.next;
            }
            return head;
        }
    }
}
