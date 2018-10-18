package basic;

public class SortTest {

	public static void main(String[] args) {
//		int[] arr = generateIntArr(10);
		int[] arr = {9,5,2,3,7,7};
		
		System.out.print("before : ");
		arrPrint(arr);
		
		double excuteTime = testPerformance(arr, new QuickSort());
		
		System.out.print("after : ");
		arrPrint(arr);
		
		System.out.println("실행 시간 : " + excuteTime + "초");
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
	
	public static double testPerformance(int[] arr, Sort sort) {
		long startTime = System.currentTimeMillis();
		
		sort.sort(arr);
		
		long endTime = System.currentTimeMillis();
		
		double excuteTime = (endTime - startTime) / 1000.0;
		
		return excuteTime;
	}
	
}
