package Logic_Building;

public class P01_Add_two_numbers_in_LL {
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            //YOUR CODE GOES HERE
            ListNode dummy = new ListNode(0);
            ListNode temp = dummy;
            int carry = 0;

            while (l1!=null || l2 != null || carry ==1){    int sum = 0;
                if (l1 !=null){
                    sum +=l1.data;
                    l1=l1.next;
                }
                if (l2!=null){
                    sum+=l2.data;
                    l2=l2.next;
                }
                sum +=carry;
                ListNode nsc = new ListNode(sum %10);
                carry = sum/10;
                temp.next = nsc;
                temp = temp.next;
            }
            return dummy.next;
        }
    }
}
