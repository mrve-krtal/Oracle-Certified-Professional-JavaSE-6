package _08.tokenizing;

import java.util.StringTokenizer;

public class Example17 {

	public static void main(String[] args) {

		String content = "key1 key2 key3";
		StringTokenizer st = new StringTokenizer(content); // default bosluga gore ayirir.
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}

		String content2 = "key1,key2,key3";
		StringTokenizer st2 = new StringTokenizer(content2, ","); // default bosluga gore ayirir.
		while (st2.hasMoreElements()) {
			System.out.println(st2.nextElement());
		}

	}
}
