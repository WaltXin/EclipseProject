/**
 * 20.25%
 * */
package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		List<String> al = new FizzBuzz().Solution(30);
		for (String s : al) {
			System.out.println(s);
		}
	}
	
	public List<String> Solution(int n) {
		List<String> list = new ArrayList<String>(n);
		for (int i = 1; i <= n; i++) {
			int buzzValue = i % 5;
			int fizzValue = i % 3;
			if (buzzValue + fizzValue == 0) {
				list.add("FizzBuzz");
			} else if (buzzValue == 0) {
				list.add("Buzz");
			} else if (fizzValue == 0) {
				list.add("Fizz");
			} else {
				list.add(i + "");
			}
		}
		return list;
	}
}
