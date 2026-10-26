public class P12_Find_Length_of_linked_lsit {
    class Solution {
        public int getLength(ListNode head) {
            // Your code goes here
            int size = 0;
            ListNode current = head;
            while(current!=null){
                size++;
                current = current.next;
            }
            return size;
        }
    }
}
