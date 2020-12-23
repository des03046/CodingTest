import java.util.Scanner;

public class primeNumber1 {
	static int answer = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			solution(sc.nextInt());
		}
		System.out.println(answer);
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
//https://www.acmicpc.net/problem/1978
