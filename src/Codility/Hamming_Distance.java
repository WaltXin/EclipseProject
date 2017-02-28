package Codility;

public class Hamming_Distance {

	public static void main(String[] args) {
		int x = 1;
		int y = 4;
		int matchValue = 0;
		int result = 0;
		String x_bi = Integer.toBinaryString(x);
		String y_bi = Integer.toBinaryString(y);
		if (x_bi.length() > y_bi.length()) {
			matchValue = x_bi.length() - y_bi.length();
			y_bi = HammingDistanceTrans(matchValue, y_bi);
		}else if(x_bi.length() < y_bi.length()) {
			matchValue = y_bi.length() - x_bi.length();
			x_bi = HammingDistanceTrans(matchValue, x_bi);
		}
		for (int i = 0; i < y_bi.length(); i++) {
			if ((x_bi.charAt(i) ^ y_bi.charAt(i)) == 1) {
				result ++;
			}
		}
		System.out.println(result);
		
		/*
		 * A xor B will change to Binary and do the xor. A xor 0 = A A xor A = 0
		 * bitCount will calculate how many 1 in integer's binary format
		 * **/
		System.out.println(Integer.bitCount(x ^ y)); 
		
	}
	
	public static String HammingDistanceTrans(int matchValue, String str) {
		for (int i = 0; i < matchValue; i++) {
			str = '0' + str;
		}
		return str;
	}

}
