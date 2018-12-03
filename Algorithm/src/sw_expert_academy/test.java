package sw_expert_academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) throws Exception {
		ArrayList<String> a = new ArrayList<>();
		a.add("1");
		a.add("3");
		a.add("99");
		a.add("2");
		
		Collections.sort(a);
		
		System.out.println(a);
	}

}
