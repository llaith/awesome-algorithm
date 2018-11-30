
/**
 * doubleCycleLinkedList
 */
public class DoubleLinkedList {

    private Node head;


    public void insert(int data) {

        Node node = new Node(data);

        if(head == null) {
            head = node;
            return;
        }

        Node index = head;
        while(index.next != null) {
            index = index.next;
        }
        index.next = node;
        node.prev = index;
    }


    public void delete(int data) {
        Node index = head;
        if(head.data == data) {
            if(head.next != null) {
                head = head.next;
                head.prev = null;
            }else {
                head = null;
            }
            return;
        }

        while(index != null) {
            if(index.data == data) {
                Node prevNode = index.prev;
                index = index.next;
                prevNode.next = index;
                if(index != null) {
                    index.prev = prevNode;
                } 
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
        }while(index != null);

        doubleLinkedList.delete(1);

        index = doubleLinkedList.head;
       do{
            System.out.println(index.data);
            index = index.next;
        } while(index != null);

    }
    
}