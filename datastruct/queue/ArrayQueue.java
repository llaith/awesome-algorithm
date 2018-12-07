
/**
 * ArrayQueue
 */
public class ArrayQueue {

    private int items[];

    private int size;

    private int head;

    private int tail;

    public ArrayQueue(int size) {
        this.items = new int[size];
        this.size = size;
    }


    public boolean enqueue(int data) {
        if(tail == size) {
            if(head == 0) {
                return false;
            }
            for(int i = head; i < tail; i++) {
                items[i - head] = items[i];
            }
            tail = tail - head;
            head = 0;
        }
        items[tail++] = data;
        
        return true;
    }

    public int dequeue() {
        if (head == tail) {
            return -1;
        }
        
        return items[head--];
    }


    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        System.out.println(arrayQueue.enqueue(1));
        System.out.println(arrayQueue.enqueue(2));
        System.out.println(arrayQueue.enqueue(3));
        System.out.println(arrayQueue.enqueue(4));
        System.out.println(arrayQueue.enqueue(5));


        System.out.println(arrayQueue.dequeue());
    }
}