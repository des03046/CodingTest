import java.util.Scanner;

public class TowerOfHanoi {
	public static int count = 0;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solution(n, 1, 2, 3);
		System.out.println(count);
		System.out.println(sb);
	}

	public static void solution(int n, int start, int mid, int end) {
		if (n == 1) {
			sb.append(start + " " + end + "\n");
			count++;
			return;
		}
		solution(n - 1, start, end, mid);
		sb.append(start + " " + end + "\n");
		count++;
		solution(n - 1, mid, start, end);
	}
}// https://www.acmicpc.net/problem/11729
