package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_2_1948_CalcTwoDate {

	public static void main(String[] args) throws Exception {
		
		// input
		int [] monthsLastDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		StringBuilder stringBuilder = new StringBuilder();
		
		// logic
		for (int i = 0; i < testCase; i++) {
			
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			
			int firstMonth 	= Integer.parseInt(stringTokenizer.nextToken());
			int firstDay 	= Integer.parseInt(stringTokenizer.nextToken());
		
			int secondMonth = Integer.parseInt(stringTokenizer.nextToken());
			int secondDay 	= Integer.parseInt(stringTokenizer.nextToken());

			int result = 0;
			
			if (firstMonth == secondMonth) {
				
				result = secondDay - firstDay + 1;
				
			} else {
				
				for (int j = firstMonth; j < secondMonth - 1; j++) {
					result += monthsLastDays[j];
				}
				
				result += secondDay;
				
				result += monthsLastDays[firstMonth - 1] - firstDay + 1;
				
			}
			
			stringBuilder.append("#" + (i + 1) + " " + result + "\n");
			
		}

		// output
		System.out.println(stringBuilder);
		
	}

}
