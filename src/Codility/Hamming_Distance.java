package Codility;

public class Hamming_Distance {

	public static void main(String[] args) {
		int x = 9;
		int y = 1;
		int result = 0;
		int matchValue = 0;
		if( x == y) result = 0;
		String xStr = Integer.toBinaryString(x);
		String yStr = Integer.toBinaryString(y);
		
		if (xStr.length() > yStr.length()) {
			 matchValue = xStr.length() - yStr.length();
			 yStr = matchBinaryLength(matchValue, yStr);
		}else if (xStr.length() < yStr.length()) {
			 matchValue = yStr.length() - xStr.length();
			 xStr = matchBinaryLength(matchValue, xStr);
		}
		
		for (int i = 0; i < xStr.length(); i++) {
			if((xStr.charAt(i) ^ yStr.charAt(i)) == 1) {
				result++;
			}
		}
		System.out.println(result);
	}
	public static String matchBinaryLength(int matchValue, String str){
		for (int i = 0; i < matchValue; i++) {
			str = '0' + str;
		}
		return str;
	}
	

}
