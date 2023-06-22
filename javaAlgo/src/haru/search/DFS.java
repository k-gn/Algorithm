package haru.search;

import java.util.LinkedList;

public class DFS {

	static boolean[] visit;
	static LinkedList<Integer>[] graph;

	public static void dfs(int v) {
		visit[v] = true;
		System.out.println(v);
		for(int nextV : graph[v]) {
			if(!visit[nextV]) dfs(nextV);
		}
	}
}
