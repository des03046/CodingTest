import java.util.Scanner;

public class Star {
	public static char a[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = ' ';
			}
		}
		solution(0, 0, n);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(a[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	public static void solution(int t, int k, int n) {
		if (n <= 1) {
			a[t][k] = '*';
			return;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1 && j == 1)
					continue;
				solution(t + (n / 3) * i, k + (n / 3) * j, n / 3);
			}
		}
	}
}//https://www.acmicpc.net/problem/2447
