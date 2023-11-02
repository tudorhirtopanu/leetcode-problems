// 2413. Smallest Even Multiple

public class SmallestEvenMultiple {

	public static void main(String[] args) {
		
		class Solution {
		    public int smallestEvenMultiple(int n) {
		        
		    	if(n%2==0) {
		    		return n;
		    	} else {
		    		return n*2;
		    	}
		    	
		    }
		}
		
		/*
		 * Alternate solution 
		 * class Solution {
		    public int smallestEvenMultiple(int n) {
	    	return n << (n & 1);
		    }
		}
		 */
		
		Solution solution = new Solution();
		
		int num = 7;
		
		int result = solution.smallestEvenMultiple(num);
		
		System.out.println("Smallest even multiple of 2 and "+ num +" is "+result);

	}

}
