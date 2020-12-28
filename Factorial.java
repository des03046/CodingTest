import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(solution(a));
	}

	public static int solution(int n) {
		if (n <= 1) {
			return 1;
		} else
			return solution(n - 1) * n;
	}
}//https://www.acmicpc.net/problem/10872
