package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//	문제 이해를 첨에 못했는데 알고나니 넘 간단한 문제..



public class B3109 {

	static int R, C;
	static char[][] graph;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

//		첫째 줄에 R과 C가 주어진다. (1 ≤ R ≤ 10,000, 5 ≤ C ≤ 500)
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		graph = new char[R][C];

		for (int i = 0; i < R; i++) {
			graph[i] = br.readLine().toCharArray();
		}

		int pipeCnt = 0;;
		
		for (int i = 0; i < R; i++) {
			if(check(i,0)) {
				pipeCnt++;
			}
		}
		
		System.out.println(pipeCnt);

	}

	public static boolean check(int x, int y) {
//		현재 위치
		graph[x][y] = 'x';
		//		도착하면		
		if (y == C - 1) {
			return true;
		}

		if (x > 0 && graph[x - 1][y + 1] == '.') {
			if(check(x - 1, y + 1)) {
				return true;
			};
		}
		if (graph[x][y + 1] == '.') {
			if(check(x, y + 1)) {
				return true;
			};

		}
		if (x < R - 1 && graph[x + 1][y + 1] == '.') {
			if(check(x + 1, y + 1)) {
				return true;
			};
		}
		return false;
	}

}
