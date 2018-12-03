package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P_1_1970_EasyChange {

	public static void main(String[] args) throws Exception {	
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		int money;
		StringBuilder result;
		int [] moneyKind = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		for (int i = 0; i < testCase; i++) {
			money = Integer.parseInt(bufferedReader.readLine());
			result = new StringBuilder();
			
			for (int j = 0; j < moneyKind.length; j++) {
				result.append(money / moneyKind[j]);
				
				if (j != moneyKind.length - 1) {
					result.append(" ");
				}
				
				money = money % moneyKind[j];
			}
			
			stringBuilder.append("#" + (i + 1) + "\n");
			stringBuilder.append(result + "\n");
		}
		
		// output
		System.out.println(stringBuilder);
	}
}
