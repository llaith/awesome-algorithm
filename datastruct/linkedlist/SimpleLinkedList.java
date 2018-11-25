/**
 * SimpleLinkedList
 */
public class SimpleLinkedList {

    private Node head;


    public void deleteNode(int data) {
        Node index = head;

        while(index.next != null) {
            if(index.next.data == data) {
                index.next = index.next.next;
                break;
            }
        }
    }


    public void addNode(int data) {
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
    }

    class Node {
        Node next = null;
        int data;
    
        public Node(int data) {
            this.data = data;
        }
    }

   
    
    
    public static void main(String[] args) {
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
        
        simpleLinkedList.addNode(1);
        simpleLinkedList.addNode(2);
        simpleLinkedList.addNode(3);

        Node index = simpleLinkedList.head;

        while(index != null) {
            System.out.println(index.data);
            index = index.next;
        }

        simpleLinkedList.deleteNode(2);
        
        while(index != null) {
            System.out.println(index.data);
            index = index.next;
        } 

    }

}