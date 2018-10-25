package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P_1_2046_PrintAsterisk {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		
		int input = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		for (int i = 0; i < input; i++) {
			stringBuilder.append("#");
		}
		
		// output
		System.out.println(stringBuilder);
	}

}
