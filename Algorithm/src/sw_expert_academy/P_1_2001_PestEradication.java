package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_1_2001_PestEradication {
	
	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		StringTokenizer stringTokenizer;
		int N;
		int M;
		int result;
		int temp;
		int[][] ground;
		
		for (int i = 0; i < testCase; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			N = Integer.parseInt(stringTokenizer.nextToken());
			M = Integer.parseInt(stringTokenizer.nextToken());
			ground = new int[N][N];
			result = 0;
			temp = 0;
			
			for (int j = 0; j < N; j ++) {
				stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
				
				for (int k = 0; k < N; k++) {
					ground[j][k] = Integer.parseInt(stringTokenizer.nextToken()); 
				}
			}
			
			for (int j = 0; j < N - M + 1; j++) {
				for (int k = 0; k < N - M + 1; k++) {
					for (int l = j; l < M + j; l++) {
						for (int m = k; m < M + k; m++) {
							temp += ground[l][m];
						}
					}
					
					if (temp > result) {
						result = temp;
					}
					
					temp = 0;
				}
			}
			
			stringBuilder.append("#" + (i + 1) + " " + result + "\n");
		}
		
		// output
		System.out.println(stringBuilder);
		
		bufferedReader.close();
	}
	
}
