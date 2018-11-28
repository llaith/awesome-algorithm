
/**
 * DoubleLinkedList
 */
public class DoubleLinkedList {

    private Node head;


    public void insert(int data) {

        Node node = new Node(data);

        if(head == null) {
            head = node;
            head.next = head;
            head.prev = head;
            return;
        }

        Node index = head;
        while(index.next != head) {
            index = index.next;
        }
        
        index.next = node;
        node.prev = index;
        node.next = head;
        head.prev = node;
    }


    public void delete(int data) {

        Node index = head;

        if(head.data == data) {
            if(head.next != head) {
                Node prevNode = head.prev;
                Node afterNode = head.next;
                prevNode.next = afterNode;
                afterNode.prev = prevNode;
                head = afterNode;
            }else {
                head = null;
            }
        }

        while(index.next != head) {
            if(index.next.data == data) {
                Node prevNode = index;
                Node afterNode = index.next.next;
                prevNode.next = afterNode;
                afterNode.prev = prevNode;
                break;
            }
            index = index.next;
        }
    }


    class Node {
        int data;
        Node next = null;
        Node prev = null;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        doubleLinkedList.insert(1);
        doubleLinkedList.insert(2);
        doubleLinkedList.insert(3);
        doubleLinkedList.insert(4);

        Node index = doubleLinkedList.head;
        do {
            System.out.println(index.data);
            index = index.next;
        }while(index != doubleLinkedList.head);

        doubleLinkedList.delete(4);

        index = doubleLinkedList.head;
       do{
            System.out.println(index.data);
            index = index.next;
        } while(index != doubleLinkedList.head);



    }
    
}