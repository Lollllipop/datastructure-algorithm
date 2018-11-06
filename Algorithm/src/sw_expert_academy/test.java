package sw_expert_academy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class test {

	public static void main(String[] args) throws Exception {
		String a = "abcabc";
		System.out.println(a.substring(0, 5 / 2 + 1));
		System.out.println(a.substring(5 / 2 + 1, 5 + 1));
		System.out.println(a.substring(0, 5 / 2 + 1).equals(a.substring(5 / 2 + 1, 5 + 1)));
	}

}
