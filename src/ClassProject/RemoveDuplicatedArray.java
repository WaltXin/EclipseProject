package ClassProject;

public class RemoveDuplicatedArray {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3};
		for (int i = 0; i < removeDuplicate(arr).length; i++) {
			System.out.println(removeDuplicate(arr)[i]);
		}
		revertIntegerArr(arr);
	}
	
	public static int[] removeDuplicate(int[] arr){
		if (arr.length < 2) return arr;
		int id = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				arr[id++] = arr[i];
			}
		}
		
		return arr;
	}
	
	public static void revertIntegerArr(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while(j > i) {
			swap(arr, i, j);
			i ++;
			j --;
		}
		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a]);
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int tem = arr[i];
		arr[i] = arr[j];
		arr[j] = tem;
	}

}
