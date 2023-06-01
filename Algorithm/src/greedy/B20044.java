package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B20044 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());

		int[] students = new int[2*N];

		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i <2* N; i++) {
			students[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(students);
		
		int min = 200000;
		for (int i = 0;i<N;i++) {
			min = Math.min(min, students[i]+students[2*N-1-i]);
		}
		
		System.out.println(min);
		
		
	}

}
