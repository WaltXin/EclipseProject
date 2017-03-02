package LeetCode;

import java.util.Set;

public class RanMag {

	public static void main(String[] args) {

		String ran = "aac";
		String mag = "aab";
		System.out.println(solution(ran,mag));
	}
	
	public static boolean solution(String ran, String mag) {
		if(mag.length() == 0) return false;
		StringBuilder sBRan = new StringBuilder();
		sBRan.append(ran);
		StringBuilder sBMag = new StringBuilder();
		sBMag.append(mag);
		System.out.println(sBRan.charAt(2));
		first:
		for (int i = 0; i < sBRan.length(); i++) {
			for (int j = 0; j < sBMag.length(); j++) {
				if (((sBRan.charAt(i) ^ sBMag.charAt(j)) == 0)) {
					sBRan.deleteCharAt(i);
					sBMag.deleteCharAt(j);
					continue first;
				}
			}
		}
		if (sBRan.length() == 0) return true;
		
		return false;
	}

}
