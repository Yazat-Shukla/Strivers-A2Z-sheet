public class P11_Insertion_before_node_with_value_X_with_value_val {

class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
    class Solution {
        public ListNode insertBeforeX(ListNode head, int X, int val) {
            ListNode nsc = new ListNode(val);
            ListNode current = head;
            ListNode prev =null;
            if (head==null){
                return head;
            }
            current = head;
            // if (X>size){
            //     return head;
            // }
            if (head.data==X){
                nsc.next=head;
                head=nsc;

                return head;
            }
            while(current.next!=null){
                if (current.next.data==X){
                    break;
                }
                current = current.next;
            }
            if (current.next==null){
                return head;
            }

            else if (current.next.data==X){
                nsc.next = current.next;
                current.next = nsc;}
            return head;

        }
    }
}
