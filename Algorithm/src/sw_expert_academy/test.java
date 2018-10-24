package sw_expert_academy;

import java.io.Serializable;

public class test {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder();
		a.append("abcde");
		a.insert(1, "xx");
		a.setLength(0);
		a.append("123");
		System.out.print(a);
	}

}
