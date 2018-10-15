package basic;

public class InsertionSort implements Sort{
	public void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			while (i - 1 >= 0 && arr[i] < arr[i - 1]) {
				int temp = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = temp;
				i--;
			}
		}
	}
}
