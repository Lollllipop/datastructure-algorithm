package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P_1_1545_PrintReverse {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = input; i >= 0; i--) {
			stringBuilder.append(i + " ");
		}
		
		// output
		System.out.println(stringBuilder);
	}

}
