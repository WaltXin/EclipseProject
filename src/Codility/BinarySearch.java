package Codility;

public class BinarySearch {
	public static void main(String[] args) {
		int[] array = {1,2,4,6,8,12,16,18,22,134,155,166};
		int k = 1;
		int low = 0;
		int high = array.length - 1;
		System.out.print(new BinarySearch().binarySearch(k, low, high, array));
		
	}
	
	public int binarySearch(int k, int low, int high, int[] array) {
		
		if (low > high)
			return 0;
		float midValue = (float)(high + low) / 2;
		if (midValue < 1) midValue = 0;
		int mid =  (int) Math.ceil(midValue);
		
		if (k == array[mid])
			return 1;
		else if (k > array[mid])
			return binarySearch(k,mid,high,array);
		else if (k < array[mid])
			return binarySearch(k,low, mid,array);
		else 
			return 0;
		
	}
}
