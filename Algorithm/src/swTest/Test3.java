package swTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = sc.nextInt();
		Node[] arr = new Node[N + 1];

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			arr[i] = new Node(x, y);
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				double dist = Math.pow((arr[i].x-arr[j].x),2)+
						Math.pow((arr[i].y-arr[j].y),2);
				System.out.println(String.format("%.2f", dist));
			}
		}
		
	}

	public int isSquare(Node n1, Node n2, Node n3, Node n4) {
		
		
		
		
		return 1;
	}
	
}




class Node {
	public int x;
	public int y;

	public Node(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}