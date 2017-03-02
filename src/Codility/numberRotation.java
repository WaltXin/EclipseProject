package Codility;


/**
 * The best way to solve this is using queue or stack
 * */

public class numberRotation {

	public static void main(String[] args) {
		int [] A = {1,2,3,4};
		int K = 2;
		int result[] = new numberRotation().solution(A, K);
		for (int i = 0; i < A.length; i++)
		{
			System.out.println(result[i]);
		}
	}
	
	public int[] solution(int[] A, int K) {
		int[] C = {1,2,3,4};
		int [] B = A;
		int length = A.length;
		//If K equals length, it means array is same
		K = K % length;
		for (int i = 0; i < length; i++) 
		{
			if (i - K < 0) {
				B[i] = C[length - Math.abs(i - K)];
			}
			if (i - K >= 0) {
				B[i] = C[i - K];
			}
		}
		
		
		return B;
	}

}
