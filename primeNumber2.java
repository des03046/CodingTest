import java.util.Scanner;

public class primeNumber2 {
	static int answer = 0;
	static int first = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			solution(i);
		}
		if (answer > 0) {
			System.out.println(answer);
			System.out.println(first);
		} else
			System.out.println(-1);
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
			if (first == 0)
				first = n;
			answer += n;
		}
	}
}
//https://www.acmicpc.net/problem/2581
