public class DoublyLinekdList_basic_code {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(54);
        list.insertFirst(55);
        list.insertFirst(56);
        list.insertFirst(57);
        list.insertFirst(58);
        list.display();

    }
}
class DLL{
    class Node{
        int val;
        Node next;
        Node prev;
        Node (int val){
            this.val = val;
        }
        Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head!=null) {
            head.prev = node;
        }
        head = node;
    }
    public void display(){
        Node node = head;
        Node last = head;
        while(node != null){
            System.out.print(node.val +"->");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        System.out.println("Print in reverse");
        while (last!=null){
            System.out.print(last.val+"=>");
            last = last.prev;
        }
        System.out.println();
    }
    public void displayrev(){
        Node node = head;
        while(node != null){
            System.out.println(node.val +"->");
            node = node.next;
        }
        System.out.println();
    }


}