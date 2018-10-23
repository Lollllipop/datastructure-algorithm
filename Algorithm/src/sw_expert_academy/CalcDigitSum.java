package sw_expert_academy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcDigitSum {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = bufferedReader.readLine();
		
		String[] splittedInput = input.split("");
		
		int sum = 0;
		
		for (String token : splittedInput) {
			sum += Integer.parseInt(token);
		}
		
		System.out.println(sum);
	}

}
