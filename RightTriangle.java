import java.util.Arrays;
import java.util.Scanner;

public class RightTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			int arr[] = {a,b,c};
			Arrays.sort(arr);
			a = arr[0];
			b = arr[1];
			c = arr[2];
			if (a == 0 && b == 0 && c == 0) {
				break;
			}
			int t = (a * a) + (b * b);
			if ((c*c) == t)
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}
}//https://www.acmicpc.net/problem/4153
