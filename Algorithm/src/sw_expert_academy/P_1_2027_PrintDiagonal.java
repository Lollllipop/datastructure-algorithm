package sw_expert_academy;

public class P_1_2027_PrintDiagonal {

	public static void main(String[] args) {
		int colAndrowCount = 5;
		
		for (int i = 0; i < colAndrowCount; i++) {
			for (int j = 0; j < colAndrowCount; j++) {
				String outPut = i == j ? "#" : "+";
				System.out.print(outPut);
			}
			System.out.println();
		}
	}

}
