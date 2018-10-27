package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_1_2043_GuessPassword {

	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = bufferedReader.readLine();
		
		StringTokenizer stringTokenizer = new StringTokenizer(input, " ");
		
		int P = Integer.parseInt(stringTokenizer.nextToken());
		int K = Integer.parseInt(stringTokenizer.nextToken());
		
		if (P > K) {
			System.out.println(P - K  + 1);
		} else {
			System.out.println(999 - K + 1 + P + 1);
		}	
	}

}
