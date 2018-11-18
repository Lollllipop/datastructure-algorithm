package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_2_1976_SumOfTime {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		// logic
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int hour1, hour2;
		int min1, min2;
		int sumOfHour, sumOfMin;
		int oneHour = 60;
		int criteria = 12;
		
		for (int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			hour1 = Integer.parseInt(st.nextToken());
			min1 = Integer.parseInt(st.nextToken());
			hour2 = Integer.parseInt(st.nextToken());
			min2 = Integer.parseInt(st.nextToken());
			
			sumOfHour = hour1 + hour2;
			sumOfMin = min1 + min2;
			
			if (sumOfMin >= oneHour) {
				sumOfHour += sumOfMin / oneHour;
				sumOfMin = sumOfMin % oneHour;
			}
			
			if (sumOfHour > criteria) {
				sumOfHour = sumOfHour % criteria;
			}
			
			sb.append("#" + (i + 1) + " " + sumOfHour +  " " + sumOfMin + "\n");
		}
		
		// output
		System.out.println(sb);
	}

}
