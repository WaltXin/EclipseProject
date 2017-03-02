package Codility;

public class FindUnpair {

	public static void main(String[] args) {
		int A[] = {2,1,1,1,1,1,1};
		System.out.println(new FindUnpair().Solution(A));
	}
	
	public int Solution(int A[]) {
		int length = A.length;
		int standValue = 0;
		if (length == 2) {
			return A[1];
		}
		//Here length greater than 2
		if (A[0] == A[1]) {
			standValue = A[0];
		}else {
			return (A[1]==A[2])?A[0]:A[1];
		}
		
		for (int i = 2; i < A.length; i++) {
			if (standValue != A[i]) {
				return A[i];
			}
		}
		return 0;
	}

}
