package haru.backtracking;

/*
	1. 조건 만족 문제에서 해를 찾기 위한 전략
	2. 모든 경우의 수를 상태공간트리를 통해 표현
	3. 각 후보군을 DFS 방식으로 확인
	4. 조건을 만족하지 않는 노드는 더 이상 DFS 깊이 탐색을 진행하지 않고 가지를 쳐버림

	- 수직체크, 대각선 체크
 */
public class BackTracking {

	// index를 '열', 원소 값을 '행'
	public static int[] arr;
	public static int N;	// 체스판의 크기
	public static int count = 0;

	public static void nQueen(int depth) {
		// 행을 다 체우면 카운트를 1 증가시키고 리턴시킨다.
		if (depth == N) {
			count++;
			return;
		}

		for (int i = 0; i < N; i++) {
			arr[depth] = i;
			// Possibility() 해당 열에서 i 번째 행에 놓을 수 있는지를 검사하는 함수
			if (Possibility(depth)) {
				nQueen(depth + 1);
			}
		}
	}

	public static boolean Possibility(int col) {

		for (int i = 0; i < col; i++) {
			// 해당 열의 행과 i열의 행이 일치할경우 (같은 행에 존재할 경우)
			if (arr[col] == arr[i]) {
				return false;
			}

			/*
			 * 대각선상에 놓여있는 경우
			 * (열의 차와 행의 차가 같을 경우가 대각선에 놓여있는 경우다)
			 */
			else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}

		return true;
	}
}
