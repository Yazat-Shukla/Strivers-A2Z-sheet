public class P10_Insertion_at_Kth_positionwith_X_value {

    class Solution {
        public ListNode insertAtKthPosition(ListNode head, int X, int K) {
            ListNode nsc = new ListNode(X);

            if (K == 1) {
                nsc.next = head;
                return nsc;
            }

            ListNode current = head;

            for (int i = 1; i < K - 1; i++) {
                current = current.next;
            }

            nsc.next = current.next;
            current.next = nsc;

            return head;
        }
    }

}
