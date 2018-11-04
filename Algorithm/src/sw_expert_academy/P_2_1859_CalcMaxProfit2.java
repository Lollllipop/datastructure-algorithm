package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P_2_1859_CalcMaxProfit2 {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader 	= new BufferedReader(new InputStreamReader(System.in));
		int testCase 					= Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		ArrayList<Integer> prices 	= new ArrayList<>();
		StringTokenizer stringTokenizer;
		long result;
		int day;
		
		for (int i = 0; i < testCase; i++) {
			result 			= 0;
			day 			= Integer.parseInt(bufferedReader.readLine());
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			prices 			= new ArrayList<>();
			int target;
			
			for (int j = 0; j < day; j++) {
				prices.add(Integer.parseInt(stringTokenizer.nextToken()));
			}

			target = prices.size() - 1;
			
			for (int k = prices.size() - 1 ; k >= 0; k--) {
				if (prices.get(k) < prices.get(target)) {
					result += prices.get(target) - prices.get(k);
				} else {
					target = k;
				}
			}
			
			stringBuilder.append("#" + (i + 1) + " " + result + "\n");
		}
		
		// output
		System.out.println(stringBuilder);
	}

}

