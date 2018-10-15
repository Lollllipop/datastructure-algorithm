package basic;

public class SortTest {

	public static void main(String[] args) {
		
		int[] arr = generateIntArr(200);
		arrPrint(arr); // before
		testPerformance(arr, new InsertionSort());
		arrPrint(arr); // after
	}
	
	public static int[] generateIntArr(int count) {
		int [] arr = new int[count];
		
		for (int i = 0; i < count; i++) {
			arr[i] = (int) (Math.random() * count);
		}
		
		return arr;
	}
	
	public static void arrPrint(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
	
	public static void testPerformance(int[] arr, Sort sort) {
		long startTime = System.currentTimeMillis();
		
		sort.sort(arr);
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("실행 시간 : " + (endTime - startTime) / 1000.0 + "초");
	}
	
}
