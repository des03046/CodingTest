import java.util.Scanner;

public class BertrandPostulate {
	static int answer = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		while (true) {
			a = sc.nextInt();
			if (a == 0)
				break;
			b = 2 * a;
			for (int i = a + 1; i <= b; i++) {
				solution(i);
			}
			System.out.println(answer);
			answer = 0;
		}
	}

	public static void solution(int n) {
		boolean prime = true;
		if (n <= 1) {
			return;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			answer++;
		}
	}
}
//https://www.acmicpc.net/problem/4948
