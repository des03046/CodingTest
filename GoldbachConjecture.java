import java.util.Scanner;

public class GoldbachConjecture {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, t;
		t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int cnt = 0;
			a = sc.nextInt();
			b = a / 2;
			for (int j = b; j > 1; j--) {
				if (solution(j) && solution(b + cnt)) {
					System.out.println(j + " " + (b + cnt));
					break;
				} else
					cnt++;
			}
		}
	}

	public static boolean solution(int n) {
		boolean prime = true;
		if (n <= 1) {
			prime = false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}

}//https://www.acmicpc.net/problem/9020
