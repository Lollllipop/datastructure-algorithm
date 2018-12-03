package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P_1_1966_SortNumber {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		StringTokenizer stringTokenizer;
		int count;
		ArrayList<Integer> arr;
		StringBuilder result;
		
		for (int i = 0; i < testCase; i++) {
			count = Integer.parseInt(bufferedReader.readLine());
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			arr = new ArrayList<>();
			result = new StringBuilder();
			
			for (int j = 0; j < count; j++) {
				arr.add(Integer.parseInt(stringTokenizer.nextToken()));
			}
			
			Collections.sort(arr);
			
			for (int j = 0; j < count; j++) {
				if (j == count - 1) {
					result.append(arr.get(j));
				} else {
					result.append(arr.get(j) + " ");
				}
			}
			
			stringBuilder.append("#" + (i + 1) + " " + result + "\n");
		}
		
		// output
		System.out.println(stringBuilder);
	}
	
}
