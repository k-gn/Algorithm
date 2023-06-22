package haru;

public class AppMain {

	public static void main(String[] args) {

		String answer = "";

		String str1 = "aaaaa";
		String str2 = "bbbbb";

		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();

		for (int i = 0; i < str1.length(); i++) {
			answer += chars1[i];
			answer += chars2[i];
		}

		str1.repeat(3);

		System.out.println("answer = " + answer);
	}
}
