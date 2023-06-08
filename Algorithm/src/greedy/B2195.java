package greedy;

import java.util.Scanner;

public class B2195 {

	static StringBuilder S;
	static StringBuilder P;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String p = sc.next();

		
		int cnt = 0, idx = 0;
		
		for(int i = 0;i<p.length();i++) {
//			있으면 패스하고 
			if (s.indexOf(p.substring(idx, i+1))!=-1) continue;
//			없으면 cnt++ 시작인덱스 없는 곳으로 옮기자;
			cnt++;
			idx = i;
		}
		
//		마지막에 cnt+1을 하는 이유는 마지막에 항상 지나치기 때문 
		System.out.println(cnt+1);
		
		
		
	}

	
	
	
}
