package haru.inf.str;

import java.util.Scanner;

/*
	# 문장 속 단어
		- 가장 긴 단어 출력 (여러개면 가장 앞쪽꺼)
 */
public class WordInStr {
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		for (String x : s) {
			int len = x.length();
			if (len > m) {
				m = len;
				answer = x;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		WordInStr T = new WordInStr();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}
}
