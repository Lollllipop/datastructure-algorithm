package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_1_2029_CalcQuotientAndRemainder {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < testCase; i++) {
			String input = bufferedReader.readLine();
			StringTokenizer stringTokenizer = new StringTokenizer(input, " ");
			
			int a = Integer.parseInt(stringTokenizer.nextToken());
			int b = Integer.parseInt(stringTokenizer.nextToken());
			
			int quotient = a / b;
			int remainder = a % b;
			
			stringBuilder.append("#" + (i + 1) + " " + quotient + " " + remainder + "\n");
		}
		
		// output
		System.out.println(stringBuilder);
	}

}
