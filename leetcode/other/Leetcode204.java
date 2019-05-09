import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode204 {

	public int countPrimes(int n) {
		if (n - 1 < 2) {
			return 0;
		}
		Map<String,Integer> count = new HashMap<>(n/2);
		countPart(2, n -1, count);
		return count.size();
	}
	private void countPart(int begin, int end, Map<String,Integer> result) {
		if (end < begin) {
			return;
		}

		int mid = begin + ((end - begin) >> 1);

		if (isPrime(mid)) {
			if (!result.containsKey(""+mid)) {
				result.put(""+mid, 1);
			}
		}

		countPart(begin, mid - 1, result);
		countPart(mid + 1, end, result);
	}


	private boolean isPrime(int n) {
		if (n <= 1) { return false;}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) { return false;}
		}
		return true;
	}



	public static void main(String[] args) {
		Leetcode204 leetcode204 = new Leetcode204();
		System.out.println(leetcode204.countPrimes(10));
	}
}