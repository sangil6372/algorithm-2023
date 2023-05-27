package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B1911 {

	static Pair[] pools;
	static int N, L;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		L = sc.nextInt();

		pools = new Pair[N];

		for (int i = 0; i < N; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();

			pools[i] = new Pair(s, e);
		}

		Arrays.sort(pools, new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				return o1.start - o2.start;
			}
		});

		int count = 0;
//		int[] way = new int[pools[N - 1].end+1+L];  이렇게하면 메모리 초과임 ㅇ
//		반복적으로 조건을 판단하는 반복문이 나와야 한다고 생각함ㅇ
//		널빤지가 다음 웅덩이 시작점을 넘었는지가 중요함 
		
		int wayEnd = 0;
		
		
		
		for (int i = 0; i < N; i++) {
			for (int j = pools[i].start; j <= pools[i].end; j++) {
				
//				특이 케이스 한가지만 처리하면 됨
				if (j==pools[i].end&&wayEnd==j) {
					continue;
				}
				if (wayEnd<=j) {
					wayEnd = j+L;
					count++;
				}
				
			}

		}
		System.out.println(count);

	}

	static class Pair {
		int start;
		int end;

		Pair(int s, int e) {
			this.start = s;
			this.end = e;
		}
	}

}
