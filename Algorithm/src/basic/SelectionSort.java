package basic;

public class SelectionSort implements Sort {
	/*
	 * stability 	: x
	 * best case 	: O(n^2)
	 * average case : O(n^2)
	 * worst case 	: O(n^2)
	 */
	
	@Override
	public void sort(int[] arr) {
		int temp = 0;
		int minIndex = 0;
		
		for (int i = 0; i < arr.length; i++) {
			minIndex = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

}
