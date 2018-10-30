package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P_1_2019_DoubleDouble {

	public static void main(String[] args) throws Exception {
		// input 
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i <= input; i++) {
			stringBuilder.append((int)Math.pow(2, i) + " ");
		}
		
		// output
		System.out.println(stringBuilder);
	}

}
