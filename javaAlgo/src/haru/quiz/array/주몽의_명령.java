package haru.quiz.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	# 백준 온라인 저지 1940번
 */
public class 주몽의_명령 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int no = Integer.parseInt(st.nextToken());
		int sum = Integer.parseInt(st.nextToken());

		int[] nums = new int[no];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < no; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(nums);
		int start = 0;
		int end = no - 1;
		int count = 0;

		while (start < end) {
			int temp = nums[start] + nums[end];
			if (temp < sum)
				start++;
			else if (temp > sum)
				end--;
			else {
				count++;
				end--;
				start++;
			}
		}

		System.out.println(count);
	}
}
