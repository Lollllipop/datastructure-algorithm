package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_1_1938_SimpleCalculator {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = bufferedReader.readLine();
		
		// logic
		StringTokenizer stringTokenizer = new StringTokenizer(input, " ");
		StringBuilder stringBuilder = new StringBuilder();
		
		int a = Integer.parseInt(stringTokenizer.nextToken());
		int b = Integer.parseInt(stringTokenizer.nextToken());
		
		stringBuilder.append(a + b + "\n");
		stringBuilder.append(a - b + "\n");
		stringBuilder.append(a * b + "\n");
		stringBuilder.append(a / b + "\n");
		
		// output
		System.out.println(stringBuilder);
	}

}
