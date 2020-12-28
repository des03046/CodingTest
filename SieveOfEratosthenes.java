import java.util.Scanner;

public class SieveOfEratosthenes {
	public static boolean[] prime;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		solution(b);
		for (int i = a; i <= b; i++) {
			if (prime[i] == false) {
				System.out.println(i);
			}
		}
	}

	public static void solution(int n) {
		prime = new boolean[n + 1];
		prime[0] = prime[1] = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (prime[i] == true)
				continue;
			for (int j = i; i * j < prime.length; j = j + 1) {
				prime[i*j] = true;
			}
		}
	}
}
//https://www.acmicpc.net/problem/1929
