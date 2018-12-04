package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_2_1961_NumberArrayRotation {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		StringTokenizer stringTokenizer;
		String [][] arr;
		StringBuilder result = null;
		
		for (int i = 0; i < testCase; i++) {
			int N = Integer.parseInt(bufferedReader.readLine());
			arr = new String[N][N];
			result = new StringBuilder();
			
			// 값 셋팅
			for (int j = 0; j < N; j++) {
				stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
				for (int k = 0; k < N; k++) {
					arr[j][k] = stringTokenizer.nextToken();
				}
			}
			
			// 처리
			for (int j = 0; j < N; j++) {
				// 90도
				for (int k = 0; k < N; k++) {
					result.append(arr[N - k - 1][j]);
				}
				
				result.append(" ");
				
				// 180도
				for (int k = 0; k < N; k++) {
					result.append(arr[N - j - 1][N - k - 1]);
				}
				
				result.append(" ");
				
				// 270도
				for (int k = 0; k < N; k++) {
					result.append(arr[k][N - j - 1]);
				}
				
				result.append("\n");
			}
			
			stringBuilder.append("#" + (i + 1) + "\n");
			stringBuilder.append(result);
		}
		
		// output
		System.out.println(stringBuilder);
	}

}
