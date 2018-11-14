package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P_2_1983_Grading {

	public static void main(String[] args) throws Exception {
		// input
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());
		
		// logic
		StringBuilder stringBuilder = new StringBuilder();
		String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
		StringTokenizer stringTokenizer;
		String grade;
		int studentCount;
		int target;
		int targetTotalScore;
		int totalScore;
		ArrayList<Integer> totalScores;
		int mid;
		int fin;
		int ass;
		int rank;
		
		for (int i = 0; i < testCase; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			studentCount = Integer.parseInt(stringTokenizer.nextToken());
			target = Integer.parseInt(stringTokenizer.nextToken());
			totalScores = new ArrayList<Integer>();
			targetTotalScore = 0;
			
			for (int j = 0; j < studentCount; j++) {
				stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
				mid = Integer.parseInt(stringTokenizer.nextToken());
				fin = Integer.parseInt(stringTokenizer.nextToken());
				ass = Integer.parseInt(stringTokenizer.nextToken());
				totalScore = ((mid * 35)/100) + ((fin * 45)/100) + ((ass * 20)/100);
				
				totalScores.add(totalScore);
				
				if (j + 1 == target) {
					targetTotalScore = totalScore;
				}
			}
			
			Collections.sort(totalScores, Collections.reverseOrder());
			
			rank = totalScores.indexOf(targetTotalScore);
			
			grade = grades[(int) Math.round(rank / (studentCount / 10.0))];
			
			stringBuilder.append("#" + (i + 1) + " " + grade + "\n");
		}
		
		// output
		System.out.println(stringBuilder);
	}

}
