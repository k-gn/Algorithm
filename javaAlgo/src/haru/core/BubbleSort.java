package haru.core;

/*
	* 정렬에는 항상 시간복잡도가 있다.
	
	# 버블 정렬
	- 두 인접한 데이터의 크기를 비교해 정렬하는 방법
	- O(n * n) 
	- 다른 정렬 알고리즘에 비해 속도가 느리다.
	- 인접한 데이터 간의 swap 연산으로 정렬
	- size 만큼 전체 반복하고, size - i번 swap 한다.
	- 특정 루프의 전체 영역에서 swap 이 한번도 발생하지 않았다면, 그 뒤에 있는 데이터가 모두 정렬됐다는 뜻으로 프로세스를 종료하면 된다.
 */
public class BubbleSort {

	public static void bubble_sort(int[] a) {
		bubble_sort(a, a.length);
	}

	private static void bubble_sort(int[] a, int size) {

		// round는 배열 크기 - 1 만큼 진행됨 (반복횟수)
		for(int i = 1; i < size; i++) {

			// 각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
			for(int j = 0; j < size - i; j++) {

				/*
				 *  현재 원소가 다음 원소보다 클 경우
				 *  서로 원소의 위치를 교환한다.
				 */
				if(a[j] > a [j + 1]) {
					swap(a, j, j + 1);
				}
			}
		}
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
