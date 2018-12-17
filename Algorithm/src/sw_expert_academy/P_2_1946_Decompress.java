package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P_2_1946_Decompress {

	public static void main(String[] args) throws Exception {
		
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		StringBuilder stringBuilder = new StringBuilder();
		
		// logic
		for (int i = 0; i < testCase; i++) {
			
			int alphaCount = Integer.parseInt(bufferedReader.readLine());
			
			StringBuilder result = new StringBuilder();
			
			int currentIndex = 0; 
			
			for (int j = 0; j < alphaCount; j++) {
				
				String[] line = bufferedReader.readLine().split(" ");
				
				String alpha = line[0];
				int count = Integer.parseInt(line[1]);
				
				for (int k = 0; k < count; k++, currentIndex++) {
					
					if (currentIndex % 10 == 0) {
						result.append("\n");
						result.append(alpha);
					} else {
						result.append(alpha);
					}
					
				}
				
			}
			
			stringBuilder.append("#" + (i + 1) + result + "\n");
			
		}
		
		// output
		System.out.println(stringBuilder);

	}

}
