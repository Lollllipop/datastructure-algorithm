package basic;

public class MergeSort implements Sort{
	int[] temp = null;
	
	@Override
	public void sort(int[] arr) {
		temp = new int[arr.length];
		
		merge_sort(arr, 0, arr.length - 1);				
	}
	
	private void merge_sort(int arr[], int left, int right) {
		int mid;
		
		if (left < right) {
			mid = (left + right) / 2;
			merge_sort(arr, left, mid);
			merge_sort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	private void merge(int[] arr, int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int k = left;
		
		while (i <= mid && j <= right) {
			if (arr[i] <= arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			} else {
				temp[k] = arr[j];
				k++;
				j++;
			}
		}
		
		if (i > mid) {
			for (int l = j; l < right; l++) {
				temp[k] = arr[l];
				k++;
			}
		} else {
		    for(int l = i; l <= mid; l++) {
		    	temp[k] = arr[l];
		    	k++;
		    }
		}
		
		for (int l = left; l <= right; l++) {
			arr[l] = temp[l];
		}
	}
}
