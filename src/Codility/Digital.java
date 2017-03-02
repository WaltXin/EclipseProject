package Codility;

public class Digital {

	public static void main(String[] args) {
		System.out.println(new Digital().Solution(-12));
		//System.out.println(new Digital().DigitalCal(17));
	}
	
	public int Solution(int num) {
		if (num == 0) return num;
		return num % 9 == 0 ? 9 : (num % 9);
	}
	
	public int DigitalCal(int num) {
		int m = num >>> 1;
		return m;
	}
}
