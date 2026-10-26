public class P13_Search_in_Linked_list_Value{
class ListNode {
    int val;
    ListNode next;
    ListNode(int value) {
        this.val = value;
        this.next = null;
    }
}
    class Solution {
        public boolean searchKey(ListNode head, int key) {
            ListNode current = head;
            boolean tracker = false;
            while (current!=null){
                if (current.next==null && current.val!=key){
                    tracker=false;
                    break;
                }
                if (current.val==key){
                    tracker=true;
                    break;
                }
                current= current.next;

            }
            return tracker;
        }
    }
}