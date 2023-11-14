// 9. Palindrom Number

public class PalindromeNumbers {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		System.out.println(solution.isPalindrome(112));
		
	}
	
	static class Solution {
	    public boolean isPalindrome(int x) {
	        
	    	String str = Integer.toString(x);
	    	
	    	int left = 0;
	    	int right = str.length() - 1;
	    	
	    	while(left < right) {
	    		if(str.charAt(left) != str.charAt(right)) {
	    			return false;
	    		}
	    		left ++;
	    		right --;
	    	}
	    	
	    	return true;
	    }
	}

}

