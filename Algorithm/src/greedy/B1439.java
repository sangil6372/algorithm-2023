package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 연속된 숫자 뒤집어서 전부 같게 만들기
// 근데이게 왜 그리디알고리즘이지 ? 

public class B1439 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] ch = br.readLine().toCharArray();
		
		int prev = 2;
		int  cnt1 = 0;
		int  cnt0 = 0;
		
		for (char c : ch) {
			if (c=='1') {
				if (prev!='1') {
					cnt1++;
				}
				prev = '1';
			}
			else {
				if (prev!='0') {
					cnt0++;
				}
				prev = '0';
			}
		}
	
		
		
		System.out.println(Math.min(cnt0,cnt1));
		
		
		

		
		
		
		
		
	}

}
