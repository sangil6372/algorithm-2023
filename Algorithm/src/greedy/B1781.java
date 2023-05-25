package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

//	쓸데 없이 왜 정렬에 꽂힌걸까... 굳이...?



public class B1781 {

	public static void main(String[] args) throws IOException {
//	첫 줄에 숙제의 개수 N (1 ≤ N ≤ 200,000)이 들어온다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
//		Array or Linked ? indexing? update?
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		int N = Integer.parseInt(st.nextToken());
		
		 for (int i=0;i<=N;i++) {
			 graph.add(new ArrayList<>());
		 }
		
		for (int i =0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int deadline = Integer.parseInt(st.nextToken());
			int size = Integer.parseInt(st.nextToken());

			graph.get(deadline).add(size);
		}
		
//		for (ArrayList<Integer> a : graph) {
//		Collections.sort(a , new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o2-o1;
//			}
//		});
//		}
		
//		정렬 필요 없을 듯..
		
		Stack<Integer> stack = new Stack<>();
		
		PriorityQueue<Integer> pQ = new PriorityQueue<>();
		
		
		
		for (int i = 1;i<=N;i++){
			
			for (int g : graph.get(i)) {
				if (pQ.size()<i) {
					pQ.add(g);
				}
				else if (pQ.size()==i){
					if(pQ.peek()<g) {
						pQ.poll();
						pQ.add(g);
					}
				}
			}
		}
		int sum = 0;
		for (int s : pQ) {
			sum+=s;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
	}
	public static class Node{
		int deadline;
		int num;
		
		Node(int deadline, int num){
			this.deadline = deadline;
			this.num = num;
		}
		
	}
	

}
