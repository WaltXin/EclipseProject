package Codility;

public class MinAbs {

	public static void main(String[] args) {
		int[] A = {1,2,3,4,-4};
		new MinAbs().Solution(A);
	}
	
	public int Solution(int A[]) {
		int min = Integer.MAX_VALUE;
		int min_value = 0;
		int length = A.length;
		int total = 0;
		int A_value = 0;
		int B_value = 0;
		for (int i = 0; i < length; i++) {
			total += A[i];
		}
		
		for (int i = 0; i < length; i++) {
			A_value += A[i];
			B_value = total - A_value;
			min_value = Math.abs(A_value - B_value);
			if (min_value < min) {
				min = min_value;
			}
		}
		System.out.println(min);	
		return min;
	}
}
