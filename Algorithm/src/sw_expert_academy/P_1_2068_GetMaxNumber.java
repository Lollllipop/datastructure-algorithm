package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_1_2068_GetMaxNumber {

	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		for (int i = 0; i < testCase; i++) {
			String dataLine = bufferedReader.readLine();
			String delimiter = " ";
			
			StringTokenizer stringTokenizer = new StringTokenizer(dataLine, delimiter);
			
			int max = 0;
			
			while (stringTokenizer.hasMoreTokens()) {
				int token = Integer.parseInt(stringTokenizer.nextToken());
				
				if (token > max) {
					max = token;
				}
			}
			
			System.out.println("#" + (i + 1) + " " + max);
		}
	}

}
