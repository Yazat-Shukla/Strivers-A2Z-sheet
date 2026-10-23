public class P02_Deletetioninlist {
    public static void main(String[] args){

    }
    static class mylist{
        Node head;
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }

            Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }
        }
        void deletion(int target){
            Node current = head;
            Node temp = current;
            if (head==null){
                System.out.println("head is empty");
            }
            if (head.data==target){
                head = current.next;
            }
            while (current!=null){
                if (current.next.data == target){
                 current.next = current.next.next;
                }
                current = current.next;
            }
        }
    }
}
