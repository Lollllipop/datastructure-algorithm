package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P_2_1986_Zigzag {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		int number;
		int sum;
		
		for (int i = 0; i < testCase; i++) {
			number = Integer.parseInt(bufferedReader.readLine()); 
			sum = 0;
			
			for (int j = 1; j <= number; j++) {
				if (j % 2 == 0) {
					sum -= j;
				} else {
					sum += j;
				}
			}
			
			stringBuilder.append("#" + (i + 1) + " " + sum + "\n");
		}
		
		// output
		System.out.println(stringBuilder);
	}

}