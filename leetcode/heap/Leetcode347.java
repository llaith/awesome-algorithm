
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode347 {

	public List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> result = new ArrayList<>(k);

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}

		Heap heap = new Heap(map.size() + 1);

		for (Integer i : map.keySet()) {
			HeapNode heapNode = new HeapNode();
			heapNode.setKey(i);
			heapNode.setVal(map.get(i));
			heap.insert(heapNode);
		}

		for (int i = 0; i < k; i++) {
			result.add(heap.removeMax().getKey());
		}
		return result;
	}


	public static void main(String[] args) {
		Leetcode347 leetcode347 = new Leetcode347();

		int[] nums = {1};
		List<Integer> result = leetcode347.topKFrequent(nums, 1);

		for (int i : result ) {
			System.out.print(i+ " ");
		}
	}
}

class HeapNode {
	private int key;

	private int val;

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
}


class Heap {

	private HeapNode[] a;
	private int n;
	private int count;

	public Heap(int capacity) {
		a = new HeapNode[capacity + 1];
		n = capacity;
		count = 0;
	}

	public void insert(HeapNode data) {
		if (count >= n) {
			return;
		}
		count++;
		a[count] = data;
		int i = count;

		while (i / 2 > 0 && a[i].getVal() > a[i/2].getVal()) {
			swap(a, i, i/2);
			i = i / 2;
		}
	}

	public HeapNode removeMax() {
		if (count == 0) {
			return null;
		}
		HeapNode tmp = a[1];
		a[1] = a[count];
		count--;
		heapify(a, count, 1);

		return tmp;
	}

	public void sort(HeapNode[] a, int n) {
		buildHeap(a, n);
		int k = n;

		while (k > 1) {
			swap(a, 1, k);
			k--;
			heapify(a, k, 1);
		}
	}


	public void buildHeap(HeapNode[] a, int n) {
		for (int i = n / 2; i >= 1; i++) {
			heapify(a, n, i);
		}
	}


	private void heapify(HeapNode[] a, int n, int i) {
		while (true) {
			int maxPos = i;
			if (i * 2 <= n && a[i].getVal() < a[i * 2].getVal()) {
				maxPos = i * 2;
			}
			if (i * 2 + 1 <= n && a[maxPos].getVal() < a[i * 2 + 1].getVal()) {
				maxPos = i * 2 +1;
			}

			if (maxPos == i) {
				break;
			}

			swap(a, i, maxPos);

			i = maxPos;
		}
	}

	private void swap(HeapNode[] a, int i, int maxPos) {
		HeapNode tmp = a[i];
		a[i] = a[maxPos];
		a[maxPos] = tmp;
	}

}