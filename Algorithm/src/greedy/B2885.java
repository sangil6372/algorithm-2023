package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 초콜릿 나누는 문제 
// K와 N을 비교하면서 케이스를 나아가야 하는데 두 단계를 (K와 비교하기 + N자르기 -> 작으면 반으로 나눈걸 K에서 빼기)
// 한 번에 처리하려니깐 뇌가 고장났다. 그냥 단순하게 단계를 나누면 쉽게 해결할 수 있었다.

public class B2885 {

	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
//		거스름돈이랑 어찌보면 크게 다를 것 없는 듯
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int K = Integer.parseInt(br.readLine());
		
//		K와 같거나 큰 초콜릿 (2의 제곱수) 를 먼저 구해야 함
		int N = 1;
		int count = 0;
		
		while(K>N){
			N*=2;
		}
		
		
		sb.append(N+" ");
		
		
		
		
//		정확하게 K개가 되어야 하는데~
		while(K>0) {
			
			if (K>=N) {
				K-=N;
			}
			else {
				N/=2; // 반 갈라
				count++; // 갈랐으니 카운트
			}
			
		}
		
		
		
		
		
		
		
		
		sb.append(count);
		System.out.println(sb);
	}

}
