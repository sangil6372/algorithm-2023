package greedy;

import java.util.Scanner;

public class B12904 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		StringBuilder S = new StringBuilder(sc.nextLine());
		StringBuilder T = new StringBuilder(sc.nextLine());
//		문자열의 뒤에 A를 추가한다.
//		문자열을 뒤집고 뒤에 B를 추가한다.
		
//		생각의 전환...! S를 생각하지 말고 T를 하나씩 줄여가보자 마지막 단계는 예측할 수 있으니!
		while (S.length()<T.length()) {
			if (T.charAt(T.length()-1)=='A') {
				T.deleteCharAt(T.length()-1);
			}
			else {
				T.deleteCharAt(T.length()-1);
				T.reverse();
			}
		}
		
		if (S.toString().equals(T.toString())) {
			System.out.println('1');
		}else {
			System.out.println('0');
		}
		
//		String을 자주 변경하니깐 StirngBuilder를 사용해야 하나?
		
		sc.close();
	}
}
