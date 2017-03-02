/**
 * 32.27%
 * XOR 
 * 1. 0 xor A = A
 * 2. a xor a xor b = 0 xor b = b
 * */
package LeetCode;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = {1,3,1,2,2,3,5};
		System.out.println(new SingleNumber().Solution(nums));
	}
	
	public int Solution(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result = result ^ nums[i];
		}
		return result;
	}

}
