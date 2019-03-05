
public class Leetcode412 {
	
	public List<String> fizzBuzz(int n) {
       List<String> resultList = new ArrayList<String>();
       
       for (int i = 1; i <= n; i++) {
    	   if (i % 3 == 0 && i % 5 != 0) {
    		   resultList.add("Fizz");
    	   } else if (i%3 != 0 && i%5 == 0) {
    		   resultList.add("Buzz");
    	   } else if (i%3 == 0 && i%5 == 0) {
    		   resultList.add("FizzBuzz");
    	   } else {
    		   resultList.add(""+i);
    	   }
       }
       
       return resultList;
    }
	
	
	
	public static void main(String[] args) {
		Leetcode412 leetcode412 = new Leetcode412();
		
		List<String> result = leetcode412.fizzBuzz(15);
		
		for (String s : result) {
			System.out.println(s);
		}
	}

}