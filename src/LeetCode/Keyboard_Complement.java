package LeetCode;

import  java.util.*;

public class Keyboard_Complement {

	public static void main(String[] args) {
		String Input[] = {"qwe", "qaz", "power", "mb", "jdk"};
		String FirstLine = "qwertyuiop";
		String SecondLine = "asdfghjkl";
		String ThirdLine = "zxcvbnm";
		String[] lineStatus = new String[Input.length];
		//find out the words first letter in which line, then set up line status
		for (int i = 0; i < Input.length; i++) {
			String word = Input[i].charAt(0) + "";
			if (FirstLine.contains(word)) {
				lineStatus[i] = "qwertyuiop";
			}else if(SecondLine.contains(word)) {
				lineStatus[i] = "asdfghjkl";
			}else if(ThirdLine.contains(word)) {
				lineStatus[i] = "zxcvbnm";
			}
		}
		String[] result = wordValidation(Input, lineStatus);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static String[] wordValidation(String[] input, String[] linestatus) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < input.length; i++) {
			boolean stus = true;
			String word = input[i];
			for (int j = 1; j < word.length(); j++) {
				if (!linestatus[i].contains(word.charAt(j) + "")) {
					stus = false;
					break;
				}
			}
			if (stus == true)
				list.add(word);
		}
		return list.toArray(new String[list.size()]);
		
	}

}
