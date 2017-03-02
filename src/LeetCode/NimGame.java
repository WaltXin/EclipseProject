/**
 * 8.34%
 * */
package LeetCode;

public class NimGame {

	public static void main(String[] args) {
		System.out.println(new NimGame().Solution(13));
	}
	
	public boolean Solution(int n) {
		return n % 4 == 0?false:true;
	}

}
