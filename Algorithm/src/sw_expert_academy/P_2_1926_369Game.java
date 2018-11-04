package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P_2_1926_369Game {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int endNumber = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		String temp;
		
		for (int i = 1; i <= endNumber; i++) {
			temp = Integer.toString(i);
			
			StringBuilder clap = new StringBuilder();
			
			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j) != '0' && Character.getNumericValue(temp.charAt(j)) % 3 == 0) {
					clap.append("-");
				}
			}
			
			stringBuilder.append(clap.length() == 0 ? i + " " : clap + " ");
		}
		
		// output
		System.out.println(stringBuilder);
	}

}
