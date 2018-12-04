package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P_2_1954_SnailNumber {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < testCase; i++) {
			// 값 셋팅
			int N = Integer.parseInt(bufferedReader.readLine());
			int[][] arr = new int[N][N];
			
			// 코드
			for (int j = 0; j < N; j++) {
				arr[0][j] = j + 1;
			}
			
//			for () {
//				
//			}
			
			for (int j = 0; j < (N * N) - N; j++) {
				
				// 1,2
				// 2,2 아래
				
				// 2,1
				// 2,0 왼쪽
				
				// 1,0 위
				
				// 1,1 오른쪽
				
			}
		}
		
		// output
		System.out.println(stringBuilder);
	}

}
