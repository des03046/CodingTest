import java.util.Scanner;

public class Blackjack {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int c[] = new int[a];
		for (int i = 0; i < a; i++) {
			c[i] = sc.nextInt();
		}
		System.out.println(solution(c, a, b));
	}

	public static int solution(int arr[], int n, int m) {
		int cnt = 0;
		for (int i = 0; i < n - 2; i++) {
			if (arr[i] > m)
				continue;
			for (int j = i + 1; j < n - 1; j++) {
				if (arr[i] + arr[j] > m)
					continue;
				for (int k = j + 1; k < n; k++) {
					int temp = arr[i] + arr[j] + arr[k];
					if (m == temp)
						return temp;
					if (cnt < temp && temp < m) {
						cnt = temp;
					}
				}
			}
		}
		return cnt;
	}
}// https://www.acmicpc.net/problem/2798
