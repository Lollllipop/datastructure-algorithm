package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P_2_PascalsTriangle {
	
	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		int height;
		int sum;
		List<Integer> layer;
		List<Integer> tempLayer;
		
		for (int i = 0; i < testCase; i++) {
			height = Integer.parseInt(bufferedReader.readLine());
			layer = new ArrayList<Integer>();
			
			stringBuilder.append("#" + (i + 1) + "\n");

			for (int j = 1; j <= height; j++) {
				tempLayer = new ArrayList<Integer>();
				for (int k = 0; k < j; k++) {
					if (k == 0 || k == j - 1) {
						stringBuilder.append(1 + " ");
					} else {
						sum = layer.get(k - 1) + layer.get(k);
						stringBuilder.append(sum + " ");	
						tempLayer.add(sum);
					}
				}
				
				for (int g = 1; g < j - 1; g++) {
					layer.set(g, tempLayer.get(g - 1));
				}
				
				layer.add(1);
				stringBuilder.append("\n");
			}
		}
		
		// outputs
		System.out.println(stringBuilder);
	}
	
}
