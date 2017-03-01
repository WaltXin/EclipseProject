package LeetCode;

public class Number_Complement {

	public static void main(String[] args) {
		/* num = 21 ---> binary 10101 
		*  the answer should be 01010 which is int 10.
		*  Base on 10101 ^ 01010 = 11111,we can think reverse.
		*  a ^ b = c
		*  a ^ b ^ a = b
		*  c ^ b = b
		*  c is easy to get by calculate bit number
		*/ 
		
		int num = 21;
		String num_bi = Integer.toBinaryString(num);
		int length = num_bi.length();
		int xorValue = 0;
		for (int i = 0; i < length; i++) {
			xorValue += Math.pow(2, i);
		}
		int result = xorValue ^ num;
	}

}
