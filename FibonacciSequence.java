import java.util.Scanner;

public class FibonacciSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(solution(a));
	}

	public static int solution(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		} else
			return solution(n - 1) + solution(n - 2);
	}
}//https://www.acmicpc.net/problem/10870
