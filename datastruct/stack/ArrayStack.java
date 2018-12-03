
/**
 * ArrayStack
 */
public class ArrayStack {

    private int[] items;

    private int count;

    private int size;


    public ArrayStack(int size) {
        this.items = new int[size];
        this.count = 0;
        this.size = size;
    }


    public boolean push(int data) {

        if (this.size == this.count)  {
            return false;
        }
        items[this.count++] = data;
        return true;
    }

    public int pop() {
        if(this.count <= 0) {
            return -1;
        }
        return items[--this.count];
    }


    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        System.out.println(arrayStack.push(1));
        System.out.println(arrayStack.push(2));
        System.out.println(arrayStack.push(3));
        System.out.println(arrayStack.push(4));
        System.out.println(arrayStack.push(5));
        System.out.println(arrayStack.push(6));

        System.out.println(arrayStack.pop());
    }
}