package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P_2_2007_CountSameWord {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		String input;
		int wordLength = 0;
		
		for (int i = 0; i < testCase; i++) {
			input = bufferedReader.readLine();
			
			for (int j = 0; j < input.length(); j++) {
				if (j % 2 == 1) {
					if (input.substring(0, (j / 2) + 1).equals(input.substring((j / 2) + 1, j + 1))) {
						wordLength = (j / 2) + 1;
						break;
					}
				}
			}
			
			stringBuilder.append("#" + (i + 1) + " " + wordLength + "\n");
		}
		
		// output
		System.out.println(stringBuilder);
	}

}
