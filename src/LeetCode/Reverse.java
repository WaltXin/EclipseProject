/**
 * 33.83%
 * */
package LeetCode;

public class Reverse {

	public static void main(String[] args) {
		System.out.println(new Reverse().Solution("Reverse"));	
	}
	
	public String Solution(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		return sb.reverse().toString();
	}
}
