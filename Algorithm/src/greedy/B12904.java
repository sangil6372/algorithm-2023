package greedy;

import java.util.Scanner;

public class B12904 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		StringBuilder S = new StringBuilder(sc.nextLine());
		StringBuilder T = new StringBuilder(sc.nextLine());
//		문자열의 뒤에 A를 추가한다.
//		문자열을 뒤집고 뒤에 B를 추가한다.
		
		
		while (S.length()<T.length()) {
//		A를 붙이거나  =  ABA     뒤집고 B를 붙임  BAB    
//			일단 T에서 sb 찾고 있으면 ok 없으면 flag = 0
			if (T.charAt(T.length()-1)=='A') {
				T.deleteCharAt(T.length()-1);
			}
			else {
				T.deleteCharAt(T.length()-1);
				T.reverse();
			}
		}
		System.out.println(S);
		System.out.println(T);
		if (S.toString().equals(T.toString())) {
			System.out.println('1');
		}else {
			System.out.println('0');
		}
		
//		String을 자주 변경하니깐 StirngBuilder를 사용해야 하나?
		
		sc.close();
	}
}
