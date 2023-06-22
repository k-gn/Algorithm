package haru.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}

		// 정렬
		// 1 2 3 4 5
		Arrays.sort(arr);

		int prev = 0;	// 이전까지의 대기시간 누적합
		int sum = 0;	// 사람별 대기시간 총합
		for(int i = 0; i < N; i++) {
			prev += arr[i];
			sum += prev;
		}
		System.out.println(sum);
		System.out.println(prev);
	}
}
