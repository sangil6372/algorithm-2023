package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1543 {

	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
		
		sb.append(br.readLine());
		
		String find = br.readLine();
		
		int i = 0;
		
//		find 와 같은 문자열을 StringBuilder에서 찾아서 시작 인덱스를 가져옴
//		StringBuilder의 0 ~ 끝나는 인딕스 까지를 제거 함 count++
//		sb가 비어있으면 종료  
		
		
		
		int cnt = 0;
		
		while(sb.toString().indexOf(find) != -1) {
//			일단 찾고 
			int startIndex =  sb.toString().indexOf(find);
			sb.delete(0, startIndex+find.length());
			cnt++;
		}
		System.out.println(cnt);
		
		
		
		
		
		
//		
//		
////	  그리디 알고리즘을 확인해볼때 재귀를 많이 쓰나? 재귀 같기도 한데 
////		일단 첫번째 문자열은 매 비교순간마다 index가 하나씩 올라감
////		찾으려는 문자열도 매 비교순간마다 index가 올라가지만 max일때 다시 0으로 돌아옴
//		
//		int i = 0;
//		int cnt = 0;
//		for (char c : ch1) {
//			if (ch2[i]==c) {
//				if (i==ch2.length-1) {
//					cnt++;
//					i = 0;
//				}
//				else {
//					i++;
//				}
//			}
//			else {
//				i = 0;
//			}
//		}
//		System.out.println(cnt);
//		
//		
	}

}
