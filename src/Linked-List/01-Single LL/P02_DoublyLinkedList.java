public class P02_DoublyLinkedList {
    // Online Java Compiler (Editor)
// Write and run Java online using this editor.

    class Main {
        public static void main(String[] args) {
            doublelist ls = new doublelist();
            ls.insertfirst(20);

        }
    }
    class doublelist{
        class Node{
            int val;
            Node next;
            Node prev;
            Node(int val,Node next,Node prev){
                this.val = val;
                this.next = next;
                this.prev = prev;
            }
            Node(int val){
                this.val = val;
                this.next = null;
                this.prev = null;
            }

        }
        Node head;
        void insertfirst(int val){
            Node nsc = new Node(val);
            nsc.next = head;

            if (head!=null){
                head.prev = nsc;
            }
            head = nsc;
        }
        void insertlast(int val){
            Node nsc = new Node(val);
            Node current = head;
            if (head==null){
                head = nsc;
                return;
            }
            while(current.next!=null){
                current = current.next;
            }

            current.next = nsc;
            nsc.prev =current;

        }

        void display(){
            Node current = head;
            Node last = head;
            while (current!=null){
                System.out.print(current.val+"->");
                last = current;
                current = current.next;
            }
            System.out.println("List in reverse::");
            while(last!=null){
                System.out.print(last.val+"=>");
                last = last.prev;
            }
        }
        Node find(int value){
            Node current = head;
            while (current!=null){
                if (current.val ==value){
                    return current;
                }
                current = current.next;
            }
            return null;
        }

        void insertafter(int after,int val){
            Node nsc = new Node(val);
            Node current = head;
            while(current!=null){
                if (current.val==after){
                    nsc.next = current.next;
                    nsc.prev = current;
                    if (current.next!=null){
                        current.next.prev = nsc;
                    }
                    current.next = nsc;
                    break;
                }
                current = current.next;
            }

        }
        void deletefirst(){
            Node current = head;
            if(head==null){
                return;
            }
            else if (current.next !=null){
                current.next.prev = null;
                head = head.next;
            }else{
                head = null;
                return;
            }
        }
        void deletelast(){
            Node current = head;
            if (head==null){
                return;
            }else if (head.next==null){
                head = null;
                return;
            }else{
                while(current.next!=null){
                    current = current.next;
                }
                Node prev = current.prev;
                current.prev=null;
                prev.next = null;
            }
        }
        void delete(int value){
            Node current = head;

            if (head==null){
                return;
            }else if (head.next==null && head.val == value){
                head=null;
                return;
            }else{
                Node prev=null;
                while(current!=null){
                    if (current.val==value){
                        current.prev.next=current.next.next;
                        current.next.prev=current.prev;
                    }
                    current=current.next;
                }
            }
        }
    }
}
