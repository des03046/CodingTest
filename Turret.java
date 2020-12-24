import java.util.Scanner;

public class Turret {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		int x1, y1, r1, x2, y2, r2;
		int a, b, x, y;
		double d;
		t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			b = Math.abs(r2 + r1);
			a = Math.abs(r2 - r1);
			x = x2 - x1;
			y = y2 - y1;
			d = Math.sqrt((x * x) + (y * y));
			if (d == 0) {
				if (r1 == r2)
					System.out.println("-1");
				else
					System.out.println("0");
			} else {
				if (a < d && d < b)
					System.out.println("2");
				else if (d == b || d == a)
					System.out.println("1");
				else
					System.out.println("0");
			}
		}
	}
}// https://www.acmicpc.net/problem/1002
