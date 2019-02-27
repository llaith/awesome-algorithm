

/**
 * A sorted ASC array, implements insert, delete and update
 */
public class SortedArray {

	private int[] arr;
	
	private int current;
	
	public SortedArray(int size) {
		arr = new int[size];
		current = -1;
	}
	
	public boolean insert(int val) {
		
		if (current >= arr.length - 1) {
			return false;
		}
		int index = -1;
		for (int i = 0; i <= current + 1; i++) {
			if (val <= arr[i]) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			for (int i = current + 1; i >= index; i--) {
				arr[i + 1] = arr[i];
			}
			arr[index] = val;
			current++;
		} else {
			arr[++current] = val;			
		}
		return true;
	}
	
	
	public boolean delete(int index) {
		if (current == -1) {
			return false;
		}
		
		for (int i = index; i < current; i++) {
			arr[i] = arr[i+1];
		}
		arr[current] = 0;
		current--;
		return true;
	}
	
	public void update(int index, int val) {
		arr[index] = val;
	}
	
	
	public static void main(String[] args) {
		SortedArray sortedArray = new SortedArray(10);
		sortedArray.insert(1);
		sortedArray.insert(5);
		sortedArray.insert(2);
		
		sortedArray.delete(1);
		
		sortedArray.update(1, 6);
		
		for (int i = 0; i < sortedArray.arr.length; i++) {
			System.out.println(sortedArray.arr[i]);
		}
	}
}