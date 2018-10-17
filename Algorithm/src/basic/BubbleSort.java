package basic;

public class BubbleSort implements Sort{
	/*
	 * stability 	: o
	 * best case 	: O(n^2)
	 * average case : O(n^2)
	 * worst case 	: O(n^2)
	 */

	@Override
	public void sort(int[] arr) {
		int temp = 0;
		
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j  + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
