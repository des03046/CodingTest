import java.util.Scanner;

public class Bulk {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		solution(n, x, y);
		System.out.println(sb);
	}

	public static void solution(int n, int[] x, int[] y) {
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (x[j] > x[i] && y[j] > y[i]) {
					arr[i]++;
				}
			}
			sb.append((arr[i] + 1) + " ");
		}
	}
}// https://www.acmicpc.net/problem/7568
