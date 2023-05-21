package haru.quiz.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
	백준 온라인 저지 11659번
 */
public class 구간합_구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int suNo = Integer.parseInt(st.nextToken());
		int quizNo = Integer.parseInt(st.nextToken());
		long[] sumNumbers = new long[suNo + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= suNo; i++) {
			sumNumbers[i] = sumNumbers[i - 1] + Integer.parseInt(st.nextToken());
		}

		System.out.println("sumNumbers = " + Arrays.toString(sumNumbers));

		for (int q = 0; q < quizNo; q++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			System.out.println(sumNumbers[j] - sumNumbers[i - 1]);
		}
	}
}
