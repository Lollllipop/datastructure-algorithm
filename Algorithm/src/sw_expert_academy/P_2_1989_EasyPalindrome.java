package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class P_2_1989_EasyPalindrome {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		Stack<Character> stack;
		String word;
		int halfLength;
		int result;
		
		for (int i = 0; i < testCase; i++) {
			stack = new Stack<Character>();
			word = bufferedReader.readLine();
			halfLength = word.length() / 2;
			result = 1;
			
			for (int j = 0; j < halfLength; j++) {
				stack.push(word.charAt(j));
			}
			
			if (word.length() % 2 != 0) {
				halfLength++;
			}
			
			for (int j = halfLength; j < word.length(); j++) {
				if (word.charAt(j) != stack.pop()) {
					result = 0;
					break;
				}
			}
		
			stringBuilder.append("#" + (i + 1) + " " + result + "\n");
		}
		
		// output
		System.out.println(stringBuilder);
	}

}
