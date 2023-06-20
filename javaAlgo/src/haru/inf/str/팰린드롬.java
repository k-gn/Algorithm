package haru.inf.str;

import java.util.Scanner;

/*
	# 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열
 */
public class 팰린드롬 {

	public String solution(String s) {
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]", ""); // 특수문자 없애기
		String tmp = new StringBuilder(s).reverse().toString();
		if (s.equals(tmp))
			answer = "YES";
		return answer;
	}

	public static void main(String[] args) {
		팰린드롬 T = new 팰린드롬();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}
}
