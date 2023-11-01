// 1929. Concatenation of Array

public class ConcatenationOfArray {

	public static void main(String[] args) {
		
		Solution solution = new Solution();

		// Example input array
        int[] nums = {1, 2};

        // Call the getConcatenation method and store the result
        int[] concatenatedArray = solution.getConcatenation(nums);

        // Print the result
        for (int num : concatenatedArray) {
            System.out.print(num + " ");
        }
	}
	
	static class Solution {
	    public int[] getConcatenation(int[] nums) {
	        int n = nums.length;
	        int[] ans = new int[2*n];
	        for (int i = 0; i < n; i++){
	            ans[i] = nums[i];
	            ans[i + n] = nums[i];
	        }

	        return ans;

	    }
	}

}
