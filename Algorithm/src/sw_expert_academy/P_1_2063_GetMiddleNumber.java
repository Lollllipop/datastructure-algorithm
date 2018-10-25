package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P_1_2063_GetMiddleNumber {
	
	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.parseInt(bufferedReader.readLine());
		int[] numbers = new int[length];
		
		String dataLine = bufferedReader.readLine();
		String delimiter = " ";
		
		StringTokenizer stringTokenizer = new StringTokenizer(dataLine, delimiter);
		
		for (int i = 0; stringTokenizer.hasMoreTokens(); i++) {
			numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
		}
		
		Arrays.sort(numbers);

		System.out.println(numbers[length / 2]);
	}
	
}
