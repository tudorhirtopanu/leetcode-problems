// 1512. Number of Good Pairs

import java.util.HashMap;

public class NumberOfGoodPairs {

	public static void main(String[] args) {
		
		class Solution {
		    public int numIdenticalPairs(int[] nums) {
		        HashMap<Integer, Integer> count = new HashMap<>();
		        int result = 0;

		        for (int num : nums) {
		            count.put(num, count.getOrDefault(num, 0)+1);
		            result += count.get(num) - 1;
		        }

		        return result;
		    }
		}

		Solution solution = new Solution();
		
		int[] nums = {1, 2, 3, 1};
		
		int result = solution.numIdenticalPairs(nums);
		
		System.out.println("Number of good pairs: " + result);

	}
	
	

}


