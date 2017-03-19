package ClassProject;

public class TwoSumII {

	public static void main(String[] args) {
		int[] numbers = {1, 5, 7, 9};
		int target = 10;
		int[] result = asolution(numbers,target);
		for (int i:result) {
			System.out.println(i);
		}
	}
	
	public static int[] solution(int[] numbers, int target){
		//a^2 - 20a + 10 < 0 --> a = 20
		int[] result = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if(target == numbers[i] + numbers[j]) {
					result[0] = i + 1;
					result[1] = j + 1;
				}
			}
		}
		return result;	
	}
	
	//o(n) solution
	public static int[] asolution(int[] numbers, int target) {
		int[] result = new int[2];
		int lo = 0;
		int hi = numbers.length - 1;
		while (numbers[lo] + numbers[hi] != target) {
			if (numbers[lo] + numbers[hi] < target) {
				lo ++;
			} else {
				hi --;
			}
		}
		result[0] = lo + 1;
		result[1] = hi + 1;
		return result;
	}
}
