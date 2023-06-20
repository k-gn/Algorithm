package haru.inf.str;

import java.util.Scanner;

import com.sun.tools.javac.Main;

public class 숫자만추출 {

	public int solution(String s) {
		String answer = "";
		for (char x : s.toCharArray()) {
			if (Character.isDigit(x))
				answer += x;
		}
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		숫자만추출 T = new 숫자만추출();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}
