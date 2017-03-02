package Codility;

public class FogProblem {

	public static void main(String[] args) {
		System.out.println(new FogProblem().Solution(1, 5, 3));
	}
	
	public int Solution(int X, int Y, int D) {
		return (int) Math.ceil((float)(Y - X)/D);
	}

}
