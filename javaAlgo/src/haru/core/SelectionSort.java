package haru.core;

/*
	# 선택 정렬
	- O(n * n)
	- 최소 또는 최대 값을 찾고, 남은 정렬 부분의 가장 앞에 있는 데이터와 swap 한다.
 */
public class SelectionSort {

	public static void selection_sort(int[] a) {
		selection_sort(a, a.length);
	}

	private static void selection_sort(int[] a, int size) {

		for(int i = 0; i < size - 1; i++) {
			int min_index = i;

			// 최솟값을 갖고있는 인덱스 찾기
			for(int j = i + 1; j < size; j++) {
				if(a[j] < a[min_index]) {
					min_index = j;
				}
			}

			// i번째 값과 찾은 최솟값을 서로 교환
			swap(a, min_index, i);
		}
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
