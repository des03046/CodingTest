import java.util.Scanner;

public class Chess {
	public static int min = 64;
	public static boolean arr[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt(), col = sc.nextInt();

		arr = new boolean[row][col];
		sc.nextLine();
		for (int i = 0; i < row; i++) {
			String str = sc.nextLine().trim();
			for (int j = 0; j < col; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else
					arr[i][j] = false;
			}
		}
		int a = row - 7;
		int b = col - 7;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				solution(i, j);
			}
		}
		System.out.println(min);
	}

	public static void solution(int a, int b) {
		int end_x = a + 8;
		int end_y = b + 8;
		int cnt = 0;

		boolean swt = arr[a][b];
		for (int i = a; i < end_x; i++) {
			for (int j = b; j < end_y; j++) {
				if (arr[i][j] != swt) {
					cnt++;
				}
				swt = !swt;
			}
			swt = !swt;
		}
		cnt = Math.min(cnt, 64 - cnt);
		min = Math.min(min, cnt);
	}
}//https://www.acmicpc.net/problem/1018