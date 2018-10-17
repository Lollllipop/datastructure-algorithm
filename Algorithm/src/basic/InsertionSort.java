package basic;

public class InsertionSort implements Sort{
	/*
	 * stability 	: o
	 * best case 	: O(n)
	 * average case : O(n^2)
	 * worst case 	: O(n^2)
	 */
	
	@Override
	public void sort(int[] arr) {
		int temp = 0;
		
		for (int i = 1; i < arr.length; i++) {
			while (i - 1 >= 0 && arr[i] < arr[i - 1]) {
				temp = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = temp;
				i--;
			}
		}
	}
	
}
