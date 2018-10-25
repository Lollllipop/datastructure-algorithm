package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P_1_2056_ValidateAndFormatConvertDate {

	public static void main(String[] args) throws Exception {
		// 변수 정의
		StringBuilder output = new StringBuilder();
		StringBuilder dataLine = new StringBuilder();
		int month = 0;
		int day = 0;
		int[] lastDaysOfTheMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// 입력
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		// 로직
		for (int i = 0; i < testCase; i++) {
			dataLine.append(bufferedReader.readLine());
			month = Integer.parseInt(dataLine.substring(dataLine.length() - 4, dataLine.length() - 2));
			day = Integer.parseInt(dataLine.substring(dataLine.length() - 2, dataLine.length()));
			
			if (month > 0 && month <= 12 && day <= lastDaysOfTheMonth[month - 1]) {
				dataLine.insert(dataLine.length() - 4, "/");
				dataLine.insert(dataLine.length() - 2, "/");
				output.append("#" + (i + 1) + " " + dataLine + "\n");
			} else {
				output.append("#" + (i + 1) + " -1\n");
			}
			dataLine.delete(0, dataLine.length());
		}
		
		// 출력
		System.out.println(output);
	}

}
