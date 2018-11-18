package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_2_1979_SetWordInPuzzle {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		StringTokenizer stringTokenizer;
		int[][] puzzle;
		int result;
		int sum;
		int N;
		int K;
		
		for (int i = 0; i < testCase; i++) {
			// 초기화
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			N = Integer.parseInt(stringTokenizer.nextToken());
			K = Integer.parseInt(stringTokenizer.nextToken());
			puzzle = new int[N][N];
			result = 0;
			sum = 0;
			
			// 퍼즐셋팅
			for (int j = 0; j < N; j++) {
				stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
				for (int k = 0; k < N; k++) {
					puzzle[j][k] = Integer.parseInt(stringTokenizer.nextToken());
				}
			}
			
			// 처리 (행과 열을 차례대로 순회하면서 값을 찾으면 될듯)
			// 행
			for (int j = 0; j < N; j++) {
				sum = 0;
				
				for (int k = 0; k < N; k++) {
					if (puzzle[j][k] == 1) {
						sum++;
					} else {
						if (sum < K || sum > K) {
							sum = 0;
						} else {
							result++;
							sum = 0;
						}
					}
				}
				
				if (sum == K) {
					result++;
				}
			}
			
			//열
			for (int j = 0; j < N; j++) {
				sum = 0;
				
				for (int k = 0; k < N; k++) {
					if (puzzle[k][j] == 1) {
						sum++;
					} else {
						if (sum < K || sum > K) {
							sum = 0;
						} else {
							result++;
							sum = 0;
						}
					}
				}
				
				if (sum == K) {
					result++;
				}
			}
			
			stringBuilder.append("#" + (i + 1) + " " + result + "\n");
		}
		
		// output
		System.out.println(stringBuilder);
	}

}
