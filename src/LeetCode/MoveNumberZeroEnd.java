package LeetCode;

public class MoveNumberZeroEnd {

	public static void main(String[] args) {
		int[] nums = {0,1,0,0,2,3};
		int[] result = solution(nums);
		for (int i : result) {
			System.out.println(i);
		}
	}
	
	public static int[] solution(int[] nums) {
		if (nums == null) return nums;
		int insertPos = 0;
		for (int num : nums) {
			if (num != 0) {
				nums[insertPos++] = num;
			}
		}
		while (insertPos < nums.length) {
			nums[insertPos++] = 0;
		}
		return nums;
	}

}
