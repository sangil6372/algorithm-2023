package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//	java base 모듈의 BufferReader클래스로 입력스트림을 버퍼링하여 입력 받았다.
//	Scanner와 다르게 문자열을 읽는 기능만을 가지고 있으며 버퍼에 미리 읽어두고 필요할 떄마다 한 줄씩 읽어들인다.
//	Scanenr는 다양한 메서드를 제공하고 각종 타입을 제공하지만 느리다

//	StringTokenizer는 공백을 단위로 입력을 처리하기 위해서 사용했다.
//	ex) 10 300 이런식으로 한 줄에 두 개 이상의 입력을 처리하기 용이하다.

//	StringBuilder는 출력 할 것들을 모아놨다가 한 번에 출력하는 의미도 있고 
//	일단 String의 빈번한 수정은 성능상 이슈가 있기에 작업을 효율적으로 할 수있다.
//	append()로 추가하고 sysout으로 출력하자 

// 	java.base모듈의 String클래스엔 다양한 메서드들이 있다.


	





public class B27866 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		String S = st.nextToken();
		st = new StringTokenizer(br.readLine());
		int i = Integer.parseInt(st.nextToken());
		
		
		char[] c = S.toCharArray();
		
		
		sb.append(c[i-1]);
		System.out.println(sb);
		
	}
}
