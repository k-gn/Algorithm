package haru.quiz.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	# 백준 12891
 */
public class DNA_비밀번호 {

	private static int[] checks = new int[4]; // A C G T
	private static int[] myChecks = new int[4];
	private static int checkSecret = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int result = 0;

		char[] chars = new char[s];

		chars = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			checks[i] = Integer.parseInt(st.nextToken());
			if (checks[i] == 0) {
				checkSecret++;
			}
		}

		for (int i = 0; i < p; i++) { // 처음 부분문자열 초기화
			add(chars[i]);
		}

		if (checkSecret == 4)
			result++;

		// # 슬라이딩 윈도우
		for (int i = p; i < s; i++) {
			int j = i - p;
			add(chars[i]);
			remove(chars[j]);

			if (checkSecret == 4)
				result++;
		}

		System.out.println(result);
		br.close();
	}

	private static void remove(char c) {
		switch (c) {
			case 'A':
				if (myChecks[0] == checks[0])
					checkSecret--;
				myChecks[0]--;
				break;
			case 'C':
				if (myChecks[1] == checks[1])
					checkSecret--;
				myChecks[1]--;
				break;
			case 'G':
				if (myChecks[2] == checks[2])
					checkSecret--;
				myChecks[2]--;
				break;
			case 'T':
				if (myChecks[3] == checks[3])
					checkSecret--;
				myChecks[3]--;
				break;
		}
	}

	private static void add(char c) {
		switch (c) {
			case 'A':
				myChecks[0]++;
				if (myChecks[0] == checks[0])
					checkSecret++;
				break;
			case 'C':
				myChecks[1]++;
				if (myChecks[1] == checks[1])
					checkSecret++;
				break;
			case 'G':
				myChecks[2]++;
				if (myChecks[2] == checks[2])
					checkSecret++;
				break;
			case 'T':
				myChecks[3]++;
				if (myChecks[3] == checks[3])
					checkSecret++;
				break;
		}
	}
}
