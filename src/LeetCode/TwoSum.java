/*
 * Test Result: 6.05%
 */
package LeetCode;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {1,4,7};
		int target = 11;
		int[] result = new TwoSum().twoSum(nums, target);
		System.out.println(""+result[0]+result[1]);
	}
	
	public int[] twoSum(int[] nums, int target) {
	       
        int[] result = null;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                   result = new int[]{i, j};
                }
            }
        }
        return result;
    }

}
