package sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;



// 	sort 는 버블정렬, 퀵정렬, 시퀀스 정렬 들이 있지만 실제 코딩테스트에선 라이브러리를 활용한다

//	배열은 사이즈가 정의되어야 하기 때문에 이번 문제에서는 ArrayList 와 LinkedList 중에 선택해야 했다.

// 	자료구조로 LinkedList 를 선택하고 Collections 클래스의 sort 모듈을 사용했다.
//	그 과정에서 interface Comparator<>의 compare 함수를 재정의 하였다.

//	하지만 정렬의 관점에서 ArrayList가 LinkedList보다 유리하다.
//	ArrayList는 데이터의 잦은 접근 LinkedList는 데이터의 잦은 업데이트(삭제,삽입)에 유리하다.



public class B1472 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		v첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

		int N = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		
		
		while(N>0) {
			list.add(N%10);
			N/=10;
		}
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
			
			
			}
		);
		
		for (int n : list) {
			System.out.print(n);
		}
		
		
		sc.close();
	}

}
