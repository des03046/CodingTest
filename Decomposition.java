import java.util.Scanner;

public class Decomposition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int t = n;
		while (t > 0) {
			t = t / 10;
			cnt++;
		}
		System.out.println(solution(n, cnt));
	}

	public static int solution(int n, int cnt) {
		int temp = cnt * 9;
		int sum = 0;
		temp = n - temp;
		for (int i = temp; i < n; i++) {
			int t = i;
			for (int j = 0; j < cnt; j++) {
				sum += t % 10;
				t /= 10;
			}
			if (i + sum == n)
				return i;
			sum = 0;
		}
		return 0;
	}
}//https://www.acmicpc.net/problem/2231