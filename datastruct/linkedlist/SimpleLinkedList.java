/**
 * SimpleLinkedList
 */
public class SimpleLinkedList {

    private Node head;


    public void delete(int data) {
        Node index = head;

        if(head.data == data) {
            head = head.next;
        }

        while(index.next != null) {
            if(index.next.data == data) {
                index.next = index.next.next;
                break;
            }
            index = index.next;
        }
    }


    /** 
     * A basic way revert a linkedlist
     */ 
    public Node revert(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		Node prev = head;
		Node current = prev.next;
		Node next = current.next;
		prev.next = null;
		
		while(next != null) {
			current.next = prev;
			
			prev = current;
			current = next;
			next = next.next;
		}
		current.next = prev;
		head = current;
		return head;
	}

    /**
	 * Revert a linkedList by move items 
	 */
	public Node revert2(Node head) {
		
		if (head == null || head.next == null) {
			return head;
		}
		
		Node tempHade = new Node(-1);
		
		Node current = head;
		Node next = current.next;
		
		while (current != null) {
			current.next = tempHade.next;
			tempHade.next = current;
			
			current = next;
			
			if (next != null) {
				next = next.next;
			}
		}
		
		return tempHade.next;
	}
	


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
        
        simpleLinkedList.insert(1);
        simpleLinkedList.insert(2);
        simpleLinkedList.insert(3);
        simpleLinkedList.insert(4);

        Node index = simpleLinkedList.head;

        while(index != null) {
            System.out.println(index.data);
            index = index.next;
        }

        simpleLinkedList.delete(4);
        
        index = simpleLinkedList.head;
        while(index != null) {
            System.out.println(index.data);
            index = index.next;
        } 

    }

}