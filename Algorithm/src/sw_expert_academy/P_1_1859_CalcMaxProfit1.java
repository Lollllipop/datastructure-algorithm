package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P_1_1859_CalcMaxProfit1 {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		LinkedList<Integer> prices = new LinkedList<>();
		StringTokenizer stringTokenizer;
		int result;
		int day;
		
		for (int i = 0; i < testCase; i++) {
			result = 0;
			day = Integer.parseInt(bufferedReader.readLine());
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			int maxIndex;
			
			for (int j = 0; j < day; j++) {
				prices.add(Integer.parseInt(stringTokenizer.nextToken()));
			}
			
			while (!prices.isEmpty()) {
				maxIndex = prices.indexOf(Collections.max(prices));
				
				for (int k = 0; k < maxIndex; k++) {
					result += prices.get(maxIndex) - prices.get(k);
				}
				
				for (int g = 0; g < maxIndex + 1; g++) {
					prices.removeFirst();
				}
			}
			
			stringBuilder.append("#" + (i + 1) + " " + result + "\n");
			prices.clear();
		}
		
		// output
		System.out.println(stringBuilder);
	}

}
