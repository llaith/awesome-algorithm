package datastract;


public class Array {

	private int[] arr;
	
	private int length;
	
	private int current;
	
	public Array() {
		arr = new int[16];
	}

	private void Array(int size) {
		arr = new int[size];
	}
    
    // Insert a item to array, dynamic scale
	public void insert(int val) {
		
		if (current < length) {
			current++;
			arr[current] = val;
		} else {
			int[] newArr = new int[length * 2];
			
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			current++;
			newArr[current] = val;
			arr = newArr;
		}
	}
	
	// Delete a item from array
	public void delete(int index) {
		for (int i = index; i < arr.length -1; i++) {
			arr[i] = arr[i+1];
		}
		current--;
	}
	
    
    // Merge sorted array
	public int[] mergeArray(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];

		int index1 = 0;
		int index2 = 0;
		int current = 0;
		
		while (current < result.length && index1 < arr1.length && index2 < arr2.length) {
			
			if (arr1[index1] < arr2[index2]) {
				result[current++] = arr1[index1++];
			} else {
				result[current++] = arr2[index2++];
			}
		}

		if (index1 == arr1.length) {
			for (int i = current; i < result.length; i++) {
				result[i] = arr2[index2++];
			}
		}else {
			for (int i = current; i < result.length; i++) {
				result[i] = arr1[index1++];
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {	
		Array arrayCustom = new Array();
		
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {2,4,6,8,10};
		
		int[] result = arrayCustom.mergeArray(arr1, arr2);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}
}
