package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P_2_1984_CalcMiddleAverage {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		StringTokenizer stringTokenizer;
		int avg;
		int sum;
		int max;
		int min;
		int count;
		ArrayList<Integer> numbers;
		
		for (int i = 0; i < testCase; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			avg = 0;
			sum = 0;
			max = 0;
			min = 0;
			numbers = new ArrayList<Integer>();
			
			while (stringTokenizer.hasMoreTokens()) {
				numbers.add(Integer.parseInt(stringTokenizer.nextToken()));
			}
			
			count = numbers.size();
			max = Collections.max(numbers);
			min = Collections.min(numbers);
			
			while (numbers.indexOf(max) != -1) {
				numbers.set(numbers.indexOf(max), 0);
				count--;
			}
			
			while (numbers.indexOf(min) != -1) {
				numbers.set(numbers.indexOf(min), 0);
				count--;
			}
			
			for (int number : numbers) {
				sum += number;
			}
			
			avg = Math.round(sum / count);
			
			stringBuilder.append("#" + (i + 1) + " " + avg + "\n");
		}
		
		// output
		System.out.println(stringBuilder);
	}

}
