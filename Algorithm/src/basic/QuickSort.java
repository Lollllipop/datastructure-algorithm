package basic;

public class QuickSort implements Sort {
	/*
	 * stability 	: x
	 * best case 	: O(nlogn)
	 * average case : O(nlogn)
	 * worst case 	: O(n^2)
	 */
	
	
	// ******************************* //
	
	// 데이터에 중복이 있을 경우 동작 x => 고쳐야 할 점!
	
	// ******************************* //	
	
	
	@Override
	public void sort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}
	
	private void quickSort(int arr[], int left, int right) {
		if (left < right) {
			int newPivot = partition(arr, left, right);

			quickSort(arr, left, newPivot - 1);
			quickSort(arr, newPivot + 1, right);
		}
	}
	
	private int partition(int arr[], int left, int right) {
		int pivot = arr[(left + right) / 2];

		while (left < right) {
			while ((arr[left] < pivot) && (left < right)) left++;
			while ((arr[right] > pivot) && (left < right)) right--;

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}

		return left;
	}

}
