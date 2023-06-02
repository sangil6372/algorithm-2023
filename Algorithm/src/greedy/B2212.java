package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 문제 이해가 전부인 문제 K가 왜 주어졌을 지 생각해보고 
// 뭔 소린지 알면 간단하다.

public class B2212 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int [N];
		
		for (int i = 0;i<N;i++) {
			arr[i] =  Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int[] dist = new int[N-1];
		
		for (int i = 0;i<N-1;i++) {
			dist[i] = arr[i+1]-arr[i];
		}
		
		// 1 3 6 6 7 9     2 3 0 1 2   K = 2 라고 주어짐   
		
		Arrays.sort(dist);
		
		int sum = 0;
		for(int i =0;i<N-K;i++) {
			sum+=dist[i];
		}
		System.out.println(sum);
		
		
		
		
	}
}
