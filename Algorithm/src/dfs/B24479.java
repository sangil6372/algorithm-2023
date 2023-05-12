package dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//	깊이 우선 탐색
//	dfs 는 너비우선 탐색으로 일단 한 노드를 정하고 그 노드에 연결된 노드들을 우선순위에 따라 
//	재귀적으로 쭉 파고 드는 거다.


public class B24479 {

//	N개의 정점과 M개의 간선으로 구성된 무방향 그래프(undirected graph)가 주어진다.
//	graph를 ArrayList로 구현한 이유는 불 필요한 공간을 할당하지 않기 위해서! 그리고 잦은 접근 때문!
	
	
	static boolean visited[];
	static ArrayList<ArrayList<Integer>> graph;
	
	
	static int[] order;
	static int count = 1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();
		
		visited = new boolean[N+1];
		graph = new ArrayList<>();
		order = new int[N+1];
		
		for (int i = 0; i<=N;i++) {
			graph.add(new ArrayList<>());
		}
		
		
		while(M-->0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			graph.get(x).add(y);
			graph.get(y).add(x);

		
		}
		
		
		for (int i=1;i<=N;i++) {
			Collections.sort(graph.get(i));
		}

		dfs(R);

		
		for (int i = 1;i<=N;i++) {
			System.out.println(order[i]);
		}
		
	}
	
	
	
	static void dfs(int R) {
		visited[R] = true;
		order[R] = count++;
		
		for (int vertex : graph.get(R)) {
			if (visited[vertex]==false) {
			
				dfs(vertex);
			}
		}
		
	}
}
