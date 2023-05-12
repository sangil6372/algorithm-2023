package dp;

import java.util.Scanner;

//	피보나치 개념? f(n) = f(n-1) + f(n-2)
//	피보나치를 예시로 동적계획법을 알아보았다.
//	동적계획법 = 상향식 + 하향식
//	상향식 Tabulation은 반복문을 이용하고 <- 불필요한 연산을 할 수 있다.(모든 값을 다 채우기 때문)
//	하향식 Memoization은 재귀를 이용한다. <- 전역 변수로 dp 배열을 선언하는게 유리한 듯 하다.

public class B24416 {

	static int[] dpArr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		dpArr = new int[N+1];
		if (N>2) {
			dpArr[1] = 1;
			dpArr[2] = 1;
		}
		
		
		System.out.print(recursionFibo(N)+" " + memoizationFibo(N));
		
		
		
	}

	
//	재귀로 구현한 피보나치 수열
	static int recursionFibo(int N) {
		if (N==1||N==2) return 1;
		else return recursionFibo(N-1)+recursionFibo(N-2);		
	}
//	동적계획법 하향식 접근(Top-down) Memoization
	static int memoizationFibo(int N) {
	    if (dpArr[N] != 0) { // 이미 계산된 값이면 그 값을 리턴
	        return dpArr[N];
	    }
	    if (N == 1 || N == 2) {
	        return 1;
	    }
	    else {
	        // N번째 피보나치 수를 계산하여 cache 배열에 저장하고 리턴
	        int result = memoizationFibo(N-1) + memoizationFibo(N-2);
	        dpArr[N] = result;
	        return result;
	    }
	}
	
	
	
//	동적계획법으로 구현한 피보나치 수열 
//	상향식 접근(Bottom-up) Tabulation
	
	static int tabulationFibo(int N) {
		for (int i = 3;i<=N;i++) {
			dpArr[i] = dpArr[i-1] + dpArr[i-2];
		}
		return dpArr[N];
	}
	
	
}
