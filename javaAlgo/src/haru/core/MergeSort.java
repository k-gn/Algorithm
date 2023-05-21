package haru.core;

import java.util.ArrayList;
import java.util.List;

/*
	# 병합정렬
	- 분할 정복 방식을 사용해 데이터를 분할하고 분할한 집합을 정렬하며 합치는 알고리즘
	- O(NlogN)
 */
public class MergeSort {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 20; i++)
			list.add((int)(Math.random() * 100));

		System.out.println(mergeSplit(list));
	}

	private static List<Integer> mergeSplit(List<Integer> list) {
		if (list.size() <= 1)
			return list;

		int mediumSize = list.size() / 2;

		List<Integer> leftArray = mergeSplit(list.subList(0, mediumSize));
		List<Integer> rightArray = mergeSplit(list.subList(mediumSize, list.size()));

		return mergeFunc(leftArray, rightArray);
	}

	private static ArrayList<Integer> mergeFunc(
		List<Integer> leftArray,
		List<Integer> rightArray
	) {
		ArrayList<Integer> mergedList = new ArrayList<Integer>();
		int leftIdx = 0;
		int rightIdx = 0;

		// Order 1 : left/right 둘다 있을 때
		while (leftArray.size() > leftIdx && rightArray.size() > rightIdx) {

			// 좌측이 클 경우 우측 값을 mergedList에 넣는다.
			if (leftArray.get(leftIdx) > rightArray.get(rightIdx)) {
				mergedList.add(rightArray.get(rightIdx));
				rightIdx += 1;
			} else {
				mergedList.add(leftArray.get(leftIdx));
				leftIdx += 1;
			}
		}

		// Order 2 : right 데이터가 없을 때 -> left 데이터가 남아 있다면
		while (leftArray.size() > leftIdx) {
			//left 데이터를 mergedList에 채워 넣기
			mergedList.add(leftArray.get(leftIdx));
			leftIdx += 1;
		}

		// Order 3 : left 데이터가 없을 때
		while (rightArray.size() > rightIdx) {
			mergedList.add(rightArray.get(rightIdx));
			rightIdx += 1;
		}

		return mergedList;
	}
}
