package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P_1_2025_SumOfNumber {

	public static void main(String[] args) throws Exception {
		// input 
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int lastNumber = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		int sum = 0;
		
		for (int i = 1; i <= lastNumber; i++) {
			sum += i;
		}
		
		// output
		System.out.println(sum);
	}

}
