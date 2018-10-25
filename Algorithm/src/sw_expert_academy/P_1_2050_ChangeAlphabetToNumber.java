package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P_1_2050_ChangeAlphabetToNumber {

	public static void main(String[] args) throws Exception {
		// 입력
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String dataLine = bufferedReader.readLine();
		
		// 로직
		char[] chars = dataLine.toCharArray();
		int baseNumber = 64;
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < chars.length; i++) {
			int charNumber = chars[i] - baseNumber;
			stringBuilder.append(String.valueOf(charNumber) + " ");
		}
		
		// 출력
		System.out.println(stringBuilder);
	}

}
