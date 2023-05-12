package swTest;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) { // 프로그램의 시작부
		Scanner sc = new Scanner(System.in);

		int[][] canvas = new int[101][101];

		int T = sc.nextInt();

		while (T-- > 0) {
			
			canvas = new int[101][101];
			
			int width = 0;

			int N = sc.nextInt();

			while (N-- > 0) {

				int x = sc.nextInt();
				int y = sc.nextInt();

				for (int i = x; i < x + 10; i++) {
					for (int j = y; j < y + 10; j++) {
						if (canvas[i][j] == 0) {
							canvas[i][j] = 1;
							width += 1;
						}
					}
				}
				System.out.println(width);
				
			}
			System.out.println(width);


		}

		sc.close();
	}

}
