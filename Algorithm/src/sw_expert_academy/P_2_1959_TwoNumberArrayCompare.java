package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_2_1959_TwoNumberArrayCompare {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		StringTokenizer stringTokenizer;
		int [] A;
		int [] B;
		int result;
		int temp;
		
		for (int i = 0; i < testCase; i++) {
			// 값 셋팅
			result = 0;
			String firstLine = bufferedReader.readLine();
			A = new int[Integer.parseInt(firstLine.split(" ")[0])];
			B = new int[Integer.parseInt(firstLine.split(" ")[1])];
			
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			for (int j = 0; stringTokenizer.hasMoreTokens(); j++) {
				A[j] = Integer.parseInt(stringTokenizer.nextToken());
			}
			
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			for (int j = 0; stringTokenizer.hasMoreTokens(); j++) {
				B[j] = Integer.parseInt(stringTokenizer.nextToken());
			}
			
			// 코드
			if (B.length > A.length) {
				for (int j = 0; j <= (B.length - A.length); j++) {
					temp = 0;
					
					for (int k = 0; k < A.length; k++) {
						temp += A[k] * B[j + k];
					}
					
					if (result < temp) {
						result = temp;
					}
				}
			} else {
				for (int j = 0; j <= (A.length - B.length); j++) {
					temp = 0;
					
					for (int k = 0; k < B.length; k++) {
						temp += B[k] * A[j + k];
					}
					
					if (result < temp) {
						result = temp;
					}
				}
			}

			
			stringBuilder.append("#" + (i + 1) + " " + result + "\n");
		}
		
		// output
		System.out.println(stringBuilder);
	}

}
