package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_1_1936_RockPaperScissors {

	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = bufferedReader.readLine();
		StringTokenizer stringTokenizer = new StringTokenizer(input, " ");
		
		String A = stringTokenizer.nextToken();
		String B = stringTokenizer.nextToken();
		
		switch (A) {
		case "1":
			System.out.println(B.equals("2") ? "B" : "A");
			break;
		case "2":
			System.out.println(B.equals("1") ? "A" : "B");
			break;
		case "3":
			System.out.println(B.equals("2") ? "A" : "B");
			break;
		}
	}
}
