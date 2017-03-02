package LeetCode;

import java.util.*;

public class TwoArrayConnection {

	public static void main(String[] args) {
		int A[] = {1,1,2,2,4,5};
		int B[] = {1,1,4,5};
		for (int i = 0; i < (solution(A, B).length); i++) {
			System.out.println(solution(A, B)[i]);
		}
	}
	
	public static int[] solution(int A[], int B[]){
		if (A == null && B == null) return null;
		if (A == null || B == null) return null;
		Set<Integer> set = new HashSet<Integer>();
		for (int a : A) {
			for (int b : B) {
				if ((a ^ b) == 0) {
					set.add(a);
				}
			}
		}
		int loop = 0;
		int[] result = new int[set.size()];
		for (int s : set) {
			result[loop++] = s;
		}
		return result;
	}

}
