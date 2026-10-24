public class P05_deletionofheadinLL {


class ListNode {
    int data;
    ListNode next;

    ListNode() {
        this.data = 0;
        this.next = null;
    }

    ListNode(int x) {
        this.data = x;
        this.next = null;
    }

    ListNode(int x, ListNode next) {
        this.data = x;
        this.next = next;
    }
}

    class Solution {
        public ListNode deleteHead(ListNode head) {

            ListNode temp = head;

            return temp.next;
        }
    }
}
