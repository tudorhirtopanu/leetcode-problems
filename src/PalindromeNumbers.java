// 9. Palindrom Number

public class PalindromeNumbers {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		System.out.println(solution.isPalindrome(21312));
		
	}
	
	static class Solution {
	    public boolean isPalindrome(int x) {
	    	
	    	// Check for negative numbers and numbers ending with 0 (excluding 0)
	    	 if (x < 0 || (x != 0 && x % 10 == 0)) {
	             return false;
	         }
	        
	    	int reversedSecondHalf = 0;
	    	
	    	// reverse second half of number
	    	while (x > reversedSecondHalf) {
	    		reversedSecondHalf = reversedSecondHalf * 10 + x % 10;
	            x /= 10;
	    	}
	    	
	    	// compare it with the first half
	    	return (x == reversedSecondHalf || x == reversedSecondHalf / 10);
	    }
	}

}

