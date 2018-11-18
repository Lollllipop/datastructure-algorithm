package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_2_1974_SudokuValidation {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		// logic
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int result;
		int[][] puzzle;
		int[] target;
		int sum;
		int size = 9;
		int matrixSize = 3;

		
		for (int i = 0; i < testCase; i++) {
			// 변수 초기화
			result = 1;
			puzzle = new int[size][size];
			sum = 0;
			
			// 스도쿠 셋팅
			for (int j = 0; j < size; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int k = 0; k < size; k++) {
					puzzle[j][k] = Integer.parseInt(st.nextToken());
				}
			}

			// 행 검사
			for (int j = 0; j < size; j++) {
				target = new int[size];
				sum = 0;
				
				for (int k = 0; k < size; k++) {
					target[puzzle[j][k] - 1] = 1;
				}
				
				for (int g = 0; g < size; g++) {
					sum += target[g];
				}
				
				if (sum != size) {
					result = 0;
					break;
				}
			}
			
			// 열 검사
			if (result != 0) {
				for (int j = 0; j < size; j++) {
					target = new int[size];
					sum = 0;
					
					for (int k = 0; k < size; k++) {
						target[puzzle[k][j] - 1] = 1;
					}
					
					for (int g = 0; g < size; g++) {
						sum += target[g];
					}
					
					if (sum != size) {
						result = 0;
						break;
					}
				}
			}
			
			// 3x3 매트릭스 검사
			if (result != 0) {
				for (int j = 0; j < matrixSize; j++) {
					for (int k = 0; k < matrixSize; k++) {
						target = new int[size];
						sum = 0;
						
						for (int g = j * 3; g < (j + 1) * 3; g++) {
							for (int f = k * 3; f < (k + 1) * 3; f++) {
								target[puzzle[g][f] - 1] = 1;
							}
						}
						
						for (int g = 0; g < size; g++) {
							sum += target[g];
						}
						
						if (sum != size) {
							result = 0;
							break;
						}
					}
				}
			}
			
			sb.append("#" + (i + 1) + " " + result + "\n");
		}
		
		// output
		System.out.println(sb);
	}

}
