
/**
 * CycleLinkedList
 */
public class CycleLinkedList {

    private Node head;

    private Node tail;


    public void insert(int data) {

        Node node = new Node(data);

        if(head ==  null) {
            head = node;
            tail = node;
            tail.next = head;
            return;
        }

        Node index = head;
        while(index != tail) {
            index = index.next;
        }
        index.next = node;
        tail = index.next;
        tail.next = head;
    }

    public void delete(int data) {
        Node index = head;

        if(head.data == data) {
            tail.next = head.next;
            head = head.next;
        }

        while(index.next != tail) {
            if(index.next.data == data) {
                index.next = index.next.next;
                break; 
            }
            index = index.next;
        }
        if(tail.data == data) {
            index.next = head;
            tail = index;
        }
    }
    

    class Node {
        Node next = null;

        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        CycleLinkedList cycleLinkedList = new CycleLinkedList();

        cycleLinkedList.insert(1);
        cycleLinkedList.insert(2);
        cycleLinkedList.insert(3);
        cycleLinkedList.insert(4);

        Node index = cycleLinkedList.head;
        do {
            if(index != null) {
                System.out.println(index.data);
            }
            index = index.next;
        }while(index != null && index != cycleLinkedList.head);

        cycleLinkedList.delete(4);

        index = cycleLinkedList.head;
        do {
            if(index != null) {
                System.out.println(index.data);
            }
            index = index.next;
        }while(index != null && index != cycleLinkedList.head);


    }
}