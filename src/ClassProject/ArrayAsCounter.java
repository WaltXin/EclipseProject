package ClassProject;

import java.util.*;

public class ArrayAsCounter {

	public static void main(String[] args) {
		String str = "HelloWalth";
		//printFreq(str.toCharArray());
		printFreqForSpecialCharacters(str.toCharArray());
	}
	
	public static void printFreq(char[] str) {
		//The reason init int as 256 size because ASCII characters is from 0 - 255.
		int[] freq = new int[256];
		for (int i = 0; i < str.length; i++) {
			freq[str[i]]++;
		}
		for (int i = 0; i < 256; i++) {
			if (freq[i] > 0) {
				System.out.println((char)i + ": " + freq[i]);
			}
		}
	}
	
	public static void printFreqForSpecialCharacters(char[] str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length; i++) {
			if (map.containsKey(str[i])) {
				map.put(str[i],map.get(str[i]) + 1);
			} else {
				map.put(str[i], 1);
			}
		}
		for (char key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
	}

}
