package haru.recursive;

import java.util.ArrayList;

public class Hanoi {

	ArrayList<int[]> list;

	public int[][] solution(int n) {
		list = new ArrayList<>();
		hanoi(1, 2, 3, n); // n개의 원판을 1에서 시작 -> 2를 거쳐 -> 3으로 옮긴다.
		int[][] result = new int[list.size()][2];
		for (int i = 0; i < list.size(); i++) {
			result[i][0] = list.get(i)[0];
			result[i][1] = list.get(i)[1];
		}
		return result;
	}

	public void hanoi(
		int s, // 시작기둥
		int v, // 보조기둥
		int e, // 목표기둥
		int n  // 갯수
	) {
		int[] move = {s, e};

		if (n == 1)
			list.add(move);
		else {
			hanoi(s, e, v, n - 1);
			list.add(move);
			hanoi(v, s, e, n - 1);
		}
	}
}
