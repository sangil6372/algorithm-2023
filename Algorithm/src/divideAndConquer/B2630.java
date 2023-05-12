package divideAndConquer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//	분할 정복 알고리즘
//	dp와의 차이는 분할 정복은 큰 문제 -> 작은 문제, 이고  dp는 큰 문제 해답 <- 작은 문제 해답
//	헷갈렸는데 알 것 같다.



public class B2630 {

	static int[][] square;
	static int count0 = 0;
	static int count1 = 0;
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		
		square = new int[N+1][N+1];
		
		for (int i = 1;i <= N;i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1;j <= N;j++) {
				square[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		getColorCount(1, 1, N);
		

		System.out.println(count0);
		System.out.println(count1);
		
	}
	
//	전체가 같은색인지 판별하는 함수
//	같은 색이 아니면 4등분
	static boolean isSameColor(int x, int y, int length) {
//		 x y 는 시작 지점임

		for (int i = x;i < x+length;i++) {
			for (int j = y;j < y+length;j++) {
				if (square[i][j]!=square[x][y])
					return false;
			}
		}
		return true;
		
	}
//	4등분 된 영역을 또 판별 
	static void getColorCount(int x, int y, int length) {
		if (isSameColor(x, y, length)) {
			if (square[x][y]==0)count0++;
			else count1++;
		}
		else {
			getColorCount(x, y, length/2);
			getColorCount(x+length/2, y, length/2);
			getColorCount(x, y+length/2, length/2);
			getColorCount(x+length/2, y+length/2, length/2);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
}
