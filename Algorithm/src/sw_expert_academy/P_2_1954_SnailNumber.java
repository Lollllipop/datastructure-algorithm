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
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		
		for (int i = 0; i < testCase; i++) {
			
			// 값 셋팅
			int N = Integer.parseInt(bufferedReader.readLine());
			int[][] arr 	= new int[N][N];
			int[][] checker = new int[N][N];
			
			// 코드
			int x = 0;
			int y = 0;
			int direction = 0;
			for (int j = 0; j < (N * N); j++) {
				
				// 값을 더하고 해당 위치 1로 변경
				arr[x][y] = j + 1;
				checker[x][y] = 1;
				
				// 이동
				x = x + dx[direction];
				y = y + dy[direction]; 
				
				// 이동한 위치가 이미 한번 이동했던 위치이거나 배열의 범위를 넘어서면
				if (x >= N || x < 0 || y >= N || y < 0 || checker[x][y] == 1) {
					
					// 이전으로 초기화 후 
					x = x - dx[direction];
					y = y - dy[direction];
					
					// 다시 새로운 방향으로 이동!
					direction++;
					
					if (direction >= 4) {
						direction = 0;
					}
					
					// 그리고 다시 이동!
					x = x + dx[direction];
					y = y + dy[direction]; 
					
				}
				
			}
			
			// 결과 셋팅
			stringBuilder.append("#" + (i + 1) + "\n");
			for (int j = 0; j < N; j++) {
				
				for (int k = 0; k < N; k++) {
					stringBuilder.append(arr[j][k] + " ");
				}
				
				stringBuilder.append("\n");
				
			}
			
		}
		
		// output
		System.out.println(stringBuilder);
		
	}

}
