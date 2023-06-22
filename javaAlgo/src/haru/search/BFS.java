package haru.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

	static boolean[] visit;
	static LinkedList<Integer>[] graph;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();

		graph = new LinkedList[n + 1];
		visit = new boolean[n + 1];
		for(int i = 1 ; i <= n ; i ++) {
			graph[i] = new LinkedList<>();
		}

		for(int i = 0 ; i < m ; i ++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			graph[x].add(y);
			graph[y].add(x);
		}

		bfs(v);
	}

	public static void bfs(int v) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(v); //시작 정점 큐에 넣기
		visit[v] = true; //시작 정점 방문

		while(!queue.isEmpty()) {
			int temp = queue.poll();
			System.out.println(temp);

			for(int nextV : graph[temp]) {
				if(!visit[nextV]) {
					queue.add(nextV);
					visit[nextV] = true;
				}
			}
		}
	}
}
